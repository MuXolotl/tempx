package defpackage;

import android.os.SystemClock;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: lٓٝٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14292l implements InterfaceC10162l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C7800l f27970l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f27971l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C14138l f27972l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final long f27973l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final long f27974l;

    public C14292l(C14138l c14138l, int i, C7800l c7800l, long j, long j2) {
        this.f27972l = c14138l;
        this.f27971l = i;
        this.f27970l = c7800l;
        this.f27974l = j;
        this.f27973l = j2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[RETURN] */
    public static C16526l yandex(C3714l c3714l, AbstractC4620l abstractC4620l, int i) {
        C3801l c3801l = abstractC4620l.ad;
        C16526l c16526l = c3801l == null ? null : c3801l.f7917l;
        if (c16526l != null && c16526l.f32297l) {
            int[] iArr = c16526l.f32300l;
            int i2 = 0;
            if (iArr == null) {
                int[] iArr2 = c16526l.f32301l;
                if (iArr2 != null) {
                    while (i2 < iArr2.length) {
                        if (iArr2[i2] != i) {
                            i2++;
                        }
                    }
                    if (c3714l.startapp < c16526l.f32299l) {
                        return c16526l;
                    }
                } else if (c3714l.startapp < c16526l.f32299l) {
                    return c16526l;
                }
            } else {
                while (i2 < iArr.length) {
                    if (iArr[i2] != i) {
                        i2++;
                    } else if (c3714l.startapp < c16526l.f32299l) {
                        return c16526l;
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC10162l
    public final void metrica(C3823l c3823l) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        C14138l c14138l = this.f27972l;
        if (c14138l.purchase()) {
            C11361l c11361l = (C11361l) C15053l.vip().f29576l;
            if (c11361l == null || c11361l.f22908l) {
                C3714l c3714l = (C3714l) c14138l.f27644l.get(this.f27970l);
                if (c3714l != null) {
                    Object obj = c3714l.billing;
                    if (obj instanceof AbstractC4620l) {
                        AbstractC4620l abstractC4620l = (AbstractC4620l) obj;
                        long j3 = this.f27974l;
                        int i6 = 0;
                        boolean z = j3 > 0;
                        int i7 = abstractC4620l.ads;
                        if (c11361l != null) {
                            z &= c11361l.f22907l;
                            i = c11361l.f22911l;
                            i3 = c11361l.f22910l;
                            i2 = c11361l.f22909l;
                            if (abstractC4620l.ad != null && !abstractC4620l.tapsense()) {
                                C16526l c16526lYandex = yandex(c3714l, abstractC4620l, this.f27971l);
                                if (c16526lYandex == null) {
                                    return;
                                }
                                boolean z2 = c16526lYandex.f32296l && j3 > 0;
                                i3 = c16526lYandex.f32299l;
                                z = z2;
                            }
                        } else {
                            i = 5000;
                            i2 = 0;
                            i3 = 100;
                        }
                        int i8 = i;
                        int iElapsedRealtime = -1;
                        if (c3823l.smaato()) {
                            i5 = 0;
                        } else if (c3823l.amazon) {
                            i6 = -1;
                            i5 = 100;
                        } else {
                            Exception excSubs = c3823l.subs();
                            if (excSubs instanceof C3890l) {
                                Status status = ((C3890l) excSubs).f8033l;
                                i4 = status.f584l;
                                C10602l c10602l = status.f585l;
                                if (c10602l != null) {
                                    i5 = i4;
                                    i6 = c10602l.f21520l;
                                }
                            } else {
                                i4 = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
                            }
                            i5 = i4;
                            i6 = -1;
                        }
                        if (z) {
                            long j4 = this.f27973l;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j4);
                            j2 = jCurrentTimeMillis;
                            j = j3;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        C14226l c14226l = new C14226l(new C0152l(this.f27971l, i5, i6, j, j2, null, null, i7, iElapsedRealtime), i2, i8, i3);
                        HandlerC4052l handlerC4052l = c14138l.f27638l;
                        handlerC4052l.sendMessage(handlerC4052l.obtainMessage(18, c14226l));
                    }
                }
            }
        }
    }
}
