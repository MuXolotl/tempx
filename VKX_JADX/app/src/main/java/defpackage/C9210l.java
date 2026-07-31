package defpackage;

import android.view.View;

/* JADX INFO: renamed from: lٌۧٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9210l extends AbstractC5646l {
    public final /* synthetic */ int amazon;

    public /* synthetic */ C9210l(int i) {
        this.amazon = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC5646l
    public final float smaato(C15728l c15728l) {
        switch (this.amazon) {
            case 0:
                return ((View) c15728l).getAlpha();
            case 1:
                return ((View) c15728l).getScaleX();
            case 2:
                return ((View) c15728l).getScaleY();
            case 3:
                return ((View) c15728l).getRotation();
            case 4:
                return ((View) c15728l).getRotationX();
            default:
                return ((View) c15728l).getRotationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC5646l
    public final void startapp(C15728l c15728l, float f) {
        switch (this.amazon) {
            case 0:
                ((View) c15728l).setAlpha(f);
                break;
            case 1:
                ((View) c15728l).setScaleX(f);
                break;
            case 2:
                ((View) c15728l).setScaleY(f);
                break;
            case 3:
                ((View) c15728l).setRotation(f);
                break;
            case 4:
                ((View) c15728l).setRotationX(f);
                break;
            default:
                ((View) c15728l).setRotationY(f);
                break;
        }
    }
}
