package com.example.cakeslk.Employers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.cakeslk.R;

import java.util.ArrayList;

public class EmployeeViewAdapter extends ArrayAdapter {
    public EmployeeViewAdapter(@NonNull Context context, ArrayList<Employee> Employee) {
        super(context, R.layout.employee_custom_row, Employee );
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View employeeView = inflater.inflate(R.layout.employee_custom_row, parent, false);

        Employee employee =(Employee)getItem(position);
        String emp_Name= employee.EmployeeName;
        int emp_Number = employee.EmpNum;
        String emp_Add = employee.EmpAdd;
        double emp_Sal =  employee.EmpSal;

        TextView vemp_Name  = (TextView)employeeView.findViewById(R.id.eName);
        TextView vemp_Number = (TextView)employeeView.findViewById(R.id.eNum);
        TextView vemp_Add = (TextView)employeeView.findViewById(R.id.eAdd);
        TextView vemp_Sal = (TextView)employeeView.findViewById(R.id.eSal);
        ImageView orderIcon = (ImageView) employeeView.findViewById(R.id.employeeIcon);

        vemp_Name.setText(emp_Name);
        vemp_Number.setText(""+Integer.toString(emp_Number));
        vemp_Add.setText(emp_Add);
        vemp_Sal.setText("Rs. " +Double.toString(emp_Sal));


    return employeeView;
    }

}
