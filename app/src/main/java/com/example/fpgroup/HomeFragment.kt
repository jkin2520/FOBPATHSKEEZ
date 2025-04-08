package com.example.fpgroup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Go to Profile
        val actionButton: Button = view.findViewById(R.id.actionButton)
        actionButton.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, ProfileFragment())
                .addToBackStack(null)
                .commit()
        }

        // Filter Buttons
        val remoteBtn = view.findViewById<Button>(R.id.categoryRemote)
        val internshipBtn = view.findViewById<Button>(R.id.categoryInternship)
        val fullTimeBtn = view.findViewById<Button>(R.id.categoryFullTime)

        remoteBtn.setOnClickListener {
            Toast.makeText(requireContext(), "Filtering for Remote Jobs", Toast.LENGTH_SHORT).show()
            // TODO: Apply "Remote" filter to your job list here
        }

        internshipBtn.setOnClickListener {
            Toast.makeText(requireContext(), "Filtering for Internships", Toast.LENGTH_SHORT).show()
            // TODO: Apply "Internship" filter to your job list here
        }

        fullTimeBtn.setOnClickListener {
            Toast.makeText(requireContext(), "Filtering for Full-time Jobs", Toast.LENGTH_SHORT).show()
            // TODO: Apply "Full-time" filter to your job list here
        }

        return view
    }
}