package defpackage;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٔٓٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14889l extends AbstractC16232l {
    @Override // defpackage.AbstractC16232l
    public final EdgeEffect yandex(RecyclerView recyclerView) {
        EdgeEffect edgeEffect = new EdgeEffect(recyclerView.getContext());
        edgeEffect.setColor(AbstractC13209l.yandex(R.attr.global_accent));
        return edgeEffect;
    }
}
