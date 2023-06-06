package com.gazi.demo2_mobileapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class ReminderAdapter extends RecyclerView.Adapter<MyViewHolder> {
    Context context;
    ArrayList<Reminders> remindersArrayList;

    public SimpleDateFormat dateFormat = new SimpleDateFormat("EE dd MMM yyyy", Locale.US);
    public SimpleDateFormat inputDateFormat = new SimpleDateFormat("dd-M-yyyy", Locale.US);
    Date date = null;
    String outputDateString = null;

    public ReminderAdapter(Context context, ArrayList<Reminders> remindersArrayList) {
        this.context = context;
        this.remindersArrayList = remindersArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_item,parent,false);
        return  new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Reminders reminders = remindersArrayList.get(position);
        holder.title.setText(reminders.getTaskTitle());
        holder.desc.setText(reminders.getTaskDescription());
        holder.rTime.setText(reminders.getTime());

        try {
            date = inputDateFormat.parse(reminders.getDate());
            outputDateString = dateFormat.format(date);

            String[] items1 = outputDateString.split(" ");
            String day = items1[0];
            String dd = items1[1];
            String month = items1[2];

            holder.recDateDay.setText(day);
            holder.recDate.setText(dd);
            holder.recDateMonth.setText(month);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return remindersArrayList.size();
    }
}
class MyViewHolder extends RecyclerView.ViewHolder{

    TextView title,desc,rTime,recDateDay,recDateMonth,recDate;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.recTitle);
        desc = itemView.findViewById(R.id.recDescription);
        rTime = itemView.findViewById(R.id.recTime);
        recDateDay = itemView.findViewById(R.id.day);
        recDateMonth = itemView.findViewById(R.id.month);
        recDate = itemView.findViewById(R.id.date);

    }
}