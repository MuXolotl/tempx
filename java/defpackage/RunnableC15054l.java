package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٔٞٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC15054l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C14262l f29577l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29578l;

    public /* synthetic */ RunnableC15054l(C14262l c14262l, int i) {
        this.f29578l = i;
        this.f29577l = c14262l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Animation animationLoadAnimation;
        int i = this.f29578l;
        C14262l c14262l = this.f29577l;
        switch (i) {
            case 0:
                C10024l c10024l = c14262l.f27863l;
                int i2 = c10024l.f20428for;
                if (i2 != Integer.MIN_VALUE) {
                    animationLoadAnimation = AnimationUtils.loadAnimation(c14262l.f27864l, i2);
                } else {
                    int iInmobi = AbstractC5020l.inmobi(c10024l.f20427final);
                    if (iInmobi == 1) {
                        if (c10024l.subs) {
                            int iOrdinal = c10024l.metrica.ordinal();
                            if (iOrdinal == 0) {
                                i2 = R.anim.balloon_heartbeat_top;
                            } else if (iOrdinal == 1) {
                                i2 = R.anim.balloon_heartbeat_bottom;
                            } else if (iOrdinal == 2) {
                                i2 = R.anim.balloon_heartbeat_right;
                            } else if (iOrdinal != 3) {
                                C18725l.billing();
                            } else {
                                i2 = R.anim.balloon_heartbeat_left;
                            }
                        } else {
                            i2 = R.anim.balloon_heartbeat_center;
                        }
                        break;
                    } else if (iInmobi == 2) {
                        int iOrdinal2 = c10024l.metrica.ordinal();
                        if (iOrdinal2 == 0) {
                            i2 = R.anim.balloon_shake_top;
                        } else if (iOrdinal2 == 1) {
                            i2 = R.anim.balloon_shake_bottom;
                        } else if (iOrdinal2 == 2) {
                            i2 = R.anim.balloon_shake_right;
                        } else if (iOrdinal2 != 3) {
                            C18725l.billing();
                        } else {
                            i2 = R.anim.balloon_shake_left;
                        }
                        break;
                    } else if (iInmobi != 3) {
                        animationLoadAnimation = null;
                    } else {
                        i2 = R.anim.balloon_fade;
                    }
                    animationLoadAnimation = AnimationUtils.loadAnimation(c14262l.f27864l, i2);
                }
                if (animationLoadAnimation != null) {
                    ((FrameLayout) c14262l.f27860l.f30480l).startAnimation(animationLoadAnimation);
                }
                break;
            default:
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC15054l(c14262l, 0), 0L);
                break;
        }
    }
}
