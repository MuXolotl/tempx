package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.metrica;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؑۗۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0529l extends metrica {
    public final ImageView Signature;
    public final TextView license;

    public C0529l(View view) {
        super(view);
        this.Signature = (ImageView) view.findViewById(R.id.catalog_item_photo);
        this.license = (TextView) view.findViewById(R.id.catalog_item_title);
    }
}
