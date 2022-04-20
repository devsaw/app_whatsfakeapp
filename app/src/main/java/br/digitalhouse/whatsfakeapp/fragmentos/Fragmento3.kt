package br.digitalhouse.whatsfakeapp.fragmentos

import android.content.Intent
import android.content.pm.PackageManager
import android.provider.MediaStore
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import br.digitalhouse.whatsfakeapp.R

class Fragmento3 : Fragment(R.layout.fragmento3) {

    override fun onResume() {
        super.onResume()
        permissaoCamera()
    }

    fun permissaoCamera() {
        if (ContextCompat.checkSelfPermission(
                requireContext(),
                android.Manifest.permission.CAMERA
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                requireActivity(), arrayOf(android.Manifest.permission.CAMERA), 1
            )
        } else {
            var openCamera = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(openCamera)
        }
    }
}
