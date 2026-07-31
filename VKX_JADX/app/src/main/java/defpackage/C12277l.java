package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: renamed from: lِۨٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12277l extends AbstractC13799l {
    public final /* synthetic */ int purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12277l(C12124l c12124l, int i) {
        super(c12124l);
        this.purchase = i;
    }

    @Override // defpackage.AbstractC13799l
    public void adcel() {
        switch (this.purchase) {
            case 0:
                C12124l c12124l = this.loadAd;
                c12124l.f24136l = null;
                CheckableImageButton checkableImageButton = c12124l.f24126l;
                checkableImageButton.setOnLongClickListener(null);
                AbstractC11064l.mopub(checkableImageButton, null);
                break;
        }
    }
}
