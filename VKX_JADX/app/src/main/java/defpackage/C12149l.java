package defpackage;

import android.net.Uri;
import android.os.Looper;
import j$.util.Objects;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: lؘِ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12149l extends AbstractC14384l {
    public C7828l adcel;
    public final appmetrica admob;
    public C7713l ads;
    public final InterfaceC0729l firebase;
    public final C14823l isPro;
    public final C6827l metrica;
    public final boolean remoteconfig;
    public final C14513l smaato;
    public final long startapp;
    public final C1770l subs;
    public C2427l subscription;
    public final int vip;

    static {
        AbstractC17959l.yandex("media3.exoplayer.hls");
    }

    public C12149l(C2427l c2427l, C1770l c1770l, appmetrica appmetricaVar, C14823l c14823l, InterfaceC0729l interfaceC0729l, C14513l c14513l, C6827l c6827l, long j, boolean z, int i) {
        this.subscription = c2427l;
        this.adcel = c2427l.crashlytics;
        this.subs = c1770l;
        this.admob = appmetricaVar;
        this.isPro = c14823l;
        this.firebase = interfaceC0729l;
        this.smaato = c14513l;
        this.metrica = c6827l;
        this.startapp = j;
        this.remoteconfig = z;
        this.vip = i;
    }

    public static C6823l tapsense(long j, List list) {
        C6823l c6823l = null;
        for (int i = 0; i < list.size(); i++) {
            C6823l c6823l2 = (C6823l) list.get(i);
            long j2 = c6823l2.f20476l;
            if (j2 > j || !c6823l2.f14249l) {
                if (j2 > j) {
                    break;
                }
            } else {
                c6823l = c6823l2;
            }
        }
        return c6823l;
    }

    public final void Signature(C16272l c16272l) {
        long j;
        C8564l c8564l;
        long j2;
        long jM3962continue;
        long j3;
        boolean z = c16272l.startapp;
        boolean z2 = c16272l.mopub;
        AbstractC1186l abstractC1186l = c16272l.ads;
        long j4 = c16272l.Signature;
        long jM3962continue2 = c16272l.purchase;
        int i = c16272l.amazon;
        long j5 = c16272l.admob;
        long jM3986try = z ? AbstractC15323l.m3986try(j5) : -9223372036854775807L;
        long j6 = (i == 2 || i == 1) ? jM3986try : -9223372036854775807L;
        C6827l c6827l = this.metrica;
        c6827l.f14264l.getClass();
        C6565l c6565l = new C6565l(2);
        long j7 = 0;
        if (c6827l.f14273l) {
            C7043l c7043l = c16272l.license;
            long j8 = j5 - c6827l.f14262l;
            boolean z3 = c16272l.metrica;
            long j9 = z3 ? j8 + j4 : -9223372036854775807L;
            long jM3962continue3 = c16272l.startapp ? AbstractC15323l.m3962continue(AbstractC15323l.inmobi(this.startapp)) - (j5 + j4) : 0L;
            long j10 = this.adcel.yandex;
            if (j10 != -9223372036854775807L) {
                jM3962continue = AbstractC15323l.m3962continue(j10);
            } else {
                if (jM3962continue2 != -9223372036854775807L) {
                    j2 = j4 - jM3962continue2;
                } else {
                    j2 = c7043l.amazon;
                    if (j2 == -9223372036854775807L || c16272l.vip == -9223372036854775807L) {
                        j2 = c7043l.crashlytics;
                        if (j2 == -9223372036854775807L) {
                            j2 = 3 * c16272l.remoteconfig;
                        }
                    }
                }
                jM3962continue = j2 + jM3962continue3;
            }
            long j11 = j4 + jM3962continue3;
            long jFirebase = AbstractC15323l.firebase(jM3962continue, jM3962continue3, j11);
            C7828l c7828l = admob().crashlytics;
            boolean z4 = c7828l.amazon == -3.4028235E38f && c7828l.purchase == -3.4028235E38f && c7043l.crashlytics == -9223372036854775807L && c7043l.amazon == -9223372036854775807L;
            C2410l c2410lYandex = this.adcel.yandex();
            c2410lYandex.yandex = AbstractC15323l.m3986try(jFirebase);
            c2410lYandex.amazon = z4 ? 1.0f : this.adcel.amazon;
            c2410lYandex.purchase = z4 ? 1.0f : this.adcel.purchase;
            C7828l c7828l2 = new C7828l(c2410lYandex);
            this.adcel = c7828l2;
            if (jM3962continue2 == -9223372036854775807L) {
                jM3962continue2 = j11 - AbstractC15323l.m3962continue(c7828l2.yandex);
            }
            if (z2) {
                j7 = jM3962continue2;
            } else {
                C6823l c6823lTapsense = tapsense(jM3962continue2, c16272l.subscription);
                if (c6823lTapsense != null) {
                    j3 = c6823lTapsense.f20476l;
                } else if (!abstractC1186l.isEmpty()) {
                    C4234l c4234l = (C4234l) abstractC1186l.get(AbstractC15323l.amazon(abstractC1186l, Long.valueOf(jM3962continue2), true));
                    C6823l c6823lTapsense2 = tapsense(jM3962continue2, c4234l.f8669l);
                    j3 = c6823lTapsense2 != null ? c6823lTapsense2.f20476l : c4234l.f20476l;
                }
                j7 = j3;
            }
            c8564l = new C8564l(j6, jM3986try, j9, c16272l.Signature, j8, j7, true, !z3, i == 2 && c16272l.billing, c6565l, admob(), this.adcel);
        } else {
            if (jM3962continue2 == -9223372036854775807L || abstractC1186l.isEmpty()) {
                j = 0;
            } else {
                if (!z2 && jM3962continue2 != j4) {
                    jM3962continue2 = ((C4234l) abstractC1186l.get(AbstractC15323l.amazon(abstractC1186l, Long.valueOf(jM3962continue2), true))).f20476l;
                }
                j = jM3962continue2;
            }
            long j12 = c16272l.Signature;
            c8564l = new C8564l(j6, jM3986try, j12, j12, 0L, j, true, false, true, c6565l, admob(), null);
        }
        remoteconfig(c8564l);
    }

    @Override // defpackage.AbstractC14384l
    public final synchronized C2427l admob() {
        return this.subscription;
    }

    @Override // defpackage.AbstractC14384l
    public final void isPro() throws IOException {
        C6827l c6827l = this.metrica;
        C18449l c18449l = c6827l.f14257l;
        if (c18449l != null) {
            IOException iOException = (IOException) c18449l.f36012l;
            if (iOException != null) {
                throw iOException;
            }
            HandlerC9564l handlerC9564l = (HandlerC9564l) c18449l.f36009l;
            if (handlerC9564l != null) {
                int i = handlerC9564l.f19484l;
                IOException iOException2 = handlerC9564l.f19486l;
                if (iOException2 != null && handlerC9564l.f19489l > i) {
                    throw iOException2;
                }
            }
        }
        C17655l c17655l = c6827l.f14271l;
        if (c17655l != null) {
            throw c17655l;
        }
        Uri uri = c6827l.f14259l;
        if (uri != null) {
            c6827l.isPro(uri);
        }
    }

    @Override // defpackage.AbstractC14384l
    public final InterfaceC8782l loadAd(C5019l c5019l, InterfaceC3783l interfaceC3783l, long j) {
        C13698l c13698l = new C13698l((CopyOnWriteArrayList) this.crashlytics.f26746l, 0, c5019l);
        C13281l c13281l = new C13281l(this.amazon.crashlytics, 0, c5019l);
        C7713l c7713l = this.ads;
        C17849l c17849l = this.mopub;
        c17849l.getClass();
        return new C10617l(this.admob, this.metrica, this.subs, c7713l, this.firebase, c13281l, this.smaato, c13698l, interfaceC3783l, this.isPro, this.remoteconfig, this.vip, c17849l);
    }

    @Override // defpackage.AbstractC14384l
    public final void smaato(C7713l c7713l) {
        this.ads = c7713l;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        C17849l c17849l = this.mopub;
        c17849l.getClass();
        InterfaceC0729l interfaceC0729l = this.firebase;
        interfaceC0729l.firebase(looperMyLooper, c17849l);
        interfaceC0729l.yandex();
        C13698l c13698l = new C13698l((CopyOnWriteArrayList) this.crashlytics.f26746l, 0, (C5019l) null);
        C17805l c17805l = admob().loadAd;
        c17805l.getClass();
        Uri uri = c17805l.yandex;
        C6827l c6827l = this.metrica;
        c6827l.getClass();
        c6827l.f14258l = AbstractC15323l.ads(null);
        c6827l.f14270l = c13698l;
        c6827l.f14269l = this;
        Map map = Collections.EMPTY_MAP;
        AbstractC12442l.metrica(uri, "The uri must be set.");
        C14431l c14431l = new C14431l(((InterfaceC0587l) c6827l.f14261l.f4179l).pro(), new C2432l(uri, 0L, 1, null, map, 0L, -1L, null, 1, null), c6827l.f14260l.smaato());
        AbstractC12442l.subscription(c6827l.f14257l == null);
        C18449l c18449l = new C18449l("DefaultHlsPlaylistTracker:MultivariantPlaylist", 2);
        c6827l.f14257l = c18449l;
        c18449l.m4552public(c14431l, c6827l, c6827l.f14256l.license(c14431l.crashlytics));
    }

    @Override // defpackage.AbstractC14384l
    public final void startapp() {
        C6827l c6827l = this.metrica;
        c6827l.f14259l = null;
        c6827l.f14263l = null;
        c6827l.f14264l = null;
        c6827l.f14268l = null;
        c6827l.f14255l = null;
        c6827l.f14272l = null;
        c6827l.f14265l = null;
        c6827l.f14271l = null;
        c6827l.f14262l = -9223372036854775807L;
        c6827l.f14257l.m4549new(null);
        c6827l.f14257l = null;
        HashMap map = c6827l.f14267l;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C16293l) it.next()).loadAd.values().iterator();
            while (it2.hasNext()) {
                ((C16456l) it2.next()).f32165l.m4549new(null);
            }
        }
        c6827l.f14258l.removeCallbacksAndMessages(null);
        c6827l.f14258l = null;
        map.clear();
        this.firebase.release();
    }

    @Override // defpackage.AbstractC14384l
    public final synchronized void subscription(C2427l c2427l) {
        this.subscription = c2427l;
    }

    @Override // defpackage.AbstractC14384l
    public final void vip(InterfaceC8782l interfaceC8782l) {
        C10617l c10617l = (C10617l) interfaceC8782l;
        c10617l.f21546l.f14266l.remove(c10617l);
        for (C8915l c8915l : c10617l.f21542l) {
            if (c8915l.f18365l) {
                for (C4251l c4251l : c8915l.f18321l) {
                    c4251l.firebase();
                    InterfaceC9655l interfaceC9655l = c4251l.admob;
                    if (interfaceC9655l != null) {
                        interfaceC9655l.amazon(c4251l.purchase);
                        c4251l.admob = null;
                        c4251l.mopub = null;
                    }
                }
            }
            C14299l c14299l = c8915l.f18352l;
            int iSubscription = c14299l.ads.subscription();
            C6827l c6827l = c14299l.mopub;
            Uri uriCrashlytics = c14299l.purchase[iSubscription].crashlytics();
            C16293l c16293l = (C16293l) c6827l.f14267l.get(uriCrashlytics);
            if (c16293l != null) {
                C16456l c16456l = (C16456l) AbstractC2812l.adcel(c16293l.loadAd, uriCrashlytics, uriCrashlytics);
                c16456l.getClass();
                c16456l.f32173l = false;
            }
            c14299l.vip = null;
            c8915l.f18348l.m4549new(c8915l);
            c8915l.f18367l.removeCallbacksAndMessages(null);
            c8915l.f18362l = true;
            c8915l.f18341l.clear();
        }
        c10617l.f21549l = null;
    }

    @Override // defpackage.AbstractC14384l
    public final boolean yandex(C2427l c2427l) {
        C2427l c2427lAdmob = admob();
        C17805l c17805l = c2427lAdmob.loadAd;
        c17805l.getClass();
        C17805l c17805l2 = c2427l.loadAd;
        return c17805l2 != null && c17805l2.yandex.equals(c17805l.yandex) && c17805l2.purchase.equals(c17805l.purchase) && Objects.equals(c17805l2.crashlytics, c17805l.crashlytics) && c2427lAdmob.crashlytics.equals(c2427l.crashlytics);
    }
}
