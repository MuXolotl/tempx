package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import androidx.car.app.model.Alert;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: lْٖٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16456l implements InterfaceC7548l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final /* synthetic */ C6827l f32164l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C18449l f32165l = new C18449l("DefaultHlsPlaylistTracker:MediaPlaylist", 2);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public long f32166l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public long f32167l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f32168l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Uri f32169l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public boolean f32170l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C16272l f32171l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final InterfaceC14090l f32172l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public boolean f32173l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public long f32174l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public long f32175l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public IOException f32176l;

    public C16456l(C6827l c6827l, Uri uri, String str) {
        this.f32164l = c6827l;
        this.f32169l = uri;
        this.f32168l = str;
        this.f32172l = ((InterfaceC0587l) c6827l.f14261l.f4179l).pro();
    }

    @Override // defpackage.InterfaceC7548l
    public final C8128l Signature(InterfaceC13131l interfaceC13131l, long j, long j2, IOException iOException, int i) {
        C8128l c8128l = C18449l.f36005l;
        C14431l c14431l = (C14431l) interfaceC13131l;
        long j3 = c14431l.yandex;
        int i2 = c14431l.crashlytics;
        C2432l c2432l = c14431l.loadAd;
        C13384l c13384l = c14431l.amazon;
        Uri uri = c13384l.f26265l;
        C13071l c13071l = new C13071l(c2432l, uri, c13384l.f26268l, j, j2, c13384l.f26266l);
        boolean z = uri.getQueryParameter("_HLS_msn") != null;
        boolean z2 = iOException instanceof C18582l;
        Uri uri2 = this.f32169l;
        C6827l c6827l = this.f32164l;
        if (z || z2) {
            int i3 = iOException instanceof C4590l ? ((C4590l) iOException).f9323l : Alert.DURATION_SHOW_INDEFINITELY;
            if (z2 || i3 == 400 || i3 == 503) {
                this.f32167l = SystemClock.elapsedRealtime();
                purchase(uri2);
                C13698l c13698l = c6827l.f14270l;
                String str = AbstractC15323l.yandex;
                c13698l.m3680private(c13071l, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, true);
                return c8128l;
            }
        }
        C14785l c14785l = new C14785l(iOException, i, 14);
        Iterator it = c6827l.f14266l.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= !((InterfaceC17649l) it.next()).loadAd(uri2, c14785l, false);
        }
        C14513l c14513l = c6827l.f14256l;
        if (z3) {
            long jAd = c14513l.ad(c14785l);
            c8128l = jAd != -9223372036854775807L ? new C8128l(0, jAd, false) : C18449l.f36007l;
        }
        int i4 = c8128l.f16932l;
        boolean z4 = i4 == 0 || i4 == 1;
        c6827l.f14270l.m3680private(c13071l, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, !z4);
        if (!z4) {
            c14513l.getClass();
        }
        return c8128l;
    }

    public final void amazon(Uri uri) {
        C6827l c6827l = this.f32164l;
        InterfaceC6646l interfaceC6646lPurchase = c6827l.f14260l.purchase(c6827l.f14264l, this.f32171l);
        Map map = Collections.EMPTY_MAP;
        AbstractC12442l.metrica(uri, "The uri must be set.");
        C14431l c14431l = new C14431l(this.f32172l, new C2432l(uri, 0L, 1, null, map, 0L, -1L, null, 1, null), interfaceC6646lPurchase);
        this.f32165l.m4552public(c14431l, this, c6827l.f14256l.license(c14431l.crashlytics));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0250  */
    /* JADX WARN: Code duplicated, block: B:102:0x0252 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0254  */
    /* JADX WARN: Code duplicated, block: B:105:0x025f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0263  */
    /* JADX WARN: Code duplicated, block: B:109:0x0277  */
    /* JADX WARN: Code duplicated, block: B:111:0x027f  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00de  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:44:0x0103  */
    /* JADX WARN: Code duplicated, block: B:45:0x010a  */
    /* JADX WARN: Code duplicated, block: B:47:0x010d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0112  */
    /* JADX WARN: Code duplicated, block: B:51:0x0119  */
    /* JADX WARN: Code duplicated, block: B:55:0x0122  */
    /* JADX WARN: Code duplicated, block: B:56:0x012a  */
    /* JADX WARN: Code duplicated, block: B:58:0x012e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0131  */
    /* JADX WARN: Code duplicated, block: B:61:0x0134  */
    /* JADX WARN: Code duplicated, block: B:62:0x0136  */
    /* JADX WARN: Code duplicated, block: B:64:0x0142  */
    /* JADX WARN: Code duplicated, block: B:65:0x0149  */
    /* JADX WARN: Code duplicated, block: B:67:0x014c  */
    /* JADX WARN: Code duplicated, block: B:72:0x01af  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:76:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:81:0x01da A[LOOP:0: B:79:0x01d4->B:81:0x01da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x0202  */
    /* JADX WARN: Code duplicated, block: B:89:0x0215  */
    /* JADX WARN: Code duplicated, block: B:91:0x021c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0220  */
    /* JADX WARN: Code duplicated, block: B:96:0x0235 A[LOOP:1: B:94:0x022f->B:96:0x0235, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x024b A[DONT_INVERT] */
    public final void billing(C16272l c16272l, C13071l c13071l) {
        boolean z;
        long j;
        AbstractC1186l abstractC1186l;
        long j2;
        boolean z2;
        C16272l c16272l2;
        long j3;
        long j4;
        AbstractC1186l abstractC1186l2;
        int size;
        int i;
        C4234l c4234l;
        long j5;
        long j6;
        long j7;
        C16272l c16272l3;
        int i2;
        int i3;
        AbstractC1186l abstractC1186l3;
        C4234l c4234l2;
        int i4;
        C16272l c16272l4;
        C8413l c8413l;
        Uri uri;
        long size2;
        C16272l c16272l5;
        C8413l c8413l2;
        boolean z3;
        C14785l c14785l;
        Iterator it;
        C16272l c16272l6;
        C7043l c7043l;
        long j8;
        long j9;
        Iterator it2;
        int size3;
        int size4;
        int size5;
        C16272l c16272l7 = this.f32171l;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f32175l = jElapsedRealtime;
        C6827l c6827l = this.f32164l;
        CopyOnWriteArrayList copyOnWriteArrayList = c6827l.f14266l;
        if (c16272l7 != null) {
            long j10 = c16272l.firebase;
            long j11 = c16272l7.firebase;
            z = j10 > j11 || (j10 >= j11 && ((size3 = c16272l.ads.size() - c16272l7.ads.size()) == 0 ? (size4 = c16272l.subscription.size()) > (size5 = c16272l7.subscription.size()) || (size4 == size5 && c16272l.metrica && !c16272l7.metrica) : size3 > 0));
            j = c16272l.firebase;
            abstractC1186l = c16272l.ads;
            j2 = 0;
            if (z) {
                copyOnWriteArrayList = copyOnWriteArrayList;
                z2 = true;
                if (c16272l.startapp) {
                    j6 = c16272l.admob;
                } else {
                    c16272l2 = c6827l.f14263l;
                    if (c16272l2 != null) {
                        j3 = c16272l2.admob;
                    } else {
                        j3 = 0;
                    }
                    if (c16272l7 == null) {
                        long j12 = c16272l7.admob;
                        j4 = c16272l7.firebase;
                        abstractC1186l2 = c16272l7.ads;
                        size = abstractC1186l2.size();
                        i = (int) (j - j4);
                        if (i < abstractC1186l2.size()) {
                            c4234l = (C4234l) abstractC1186l2.get(i);
                        } else {
                            c4234l = null;
                        }
                        if (c4234l != null) {
                            j5 = c4234l.f20476l;
                        } else {
                            if (size == j - j4) {
                                j5 = c16272l7.Signature;
                            }
                            if (c16272l.subs) {
                                i4 = c16272l.isPro;
                            } else {
                                c16272l3 = c6827l.f14263l;
                                if (c16272l3 != null) {
                                    i2 = c16272l3.isPro;
                                } else {
                                    i2 = 0;
                                }
                                if (c16272l7 == null) {
                                    i3 = (int) (j - c16272l7.firebase);
                                    abstractC1186l3 = c16272l7.ads;
                                    if (i3 < abstractC1186l3.size()) {
                                        c4234l2 = (C4234l) abstractC1186l3.get(i3);
                                    } else {
                                        c4234l2 = null;
                                    }
                                    if (c4234l2 != null) {
                                        i2 = (c16272l7.isPro + c4234l2.f20477l) - ((C4234l) abstractC1186l.get(0)).f20477l;
                                    }
                                }
                                i4 = i2;
                            }
                            c8413l = null;
                            c16272l4 = new C16272l(c16272l.amazon, c16272l.yandex, c16272l.loadAd, c16272l.purchase, c16272l.mopub, j7, true, i4, c16272l.firebase, c16272l.smaato, c16272l.remoteconfig, c16272l.vip, c16272l.crashlytics, c16272l.metrica, c16272l.startapp, c16272l.adcel, abstractC1186l, c16272l.subscription, c16272l.license, c16272l.tapsense, c16272l.pro, c16272l.ad);
                        }
                        j6 = j12 + j5;
                    }
                    j7 = j3;
                    if (c16272l.subs) {
                        i4 = c16272l.isPro;
                    } else {
                        c16272l3 = c6827l.f14263l;
                        if (c16272l3 != null) {
                            i2 = c16272l3.isPro;
                        } else {
                            i2 = 0;
                        }
                        if (c16272l7 == null) {
                            i3 = (int) (j - c16272l7.firebase);
                            abstractC1186l3 = c16272l7.ads;
                            if (i3 < abstractC1186l3.size()) {
                                c4234l2 = (C4234l) abstractC1186l3.get(i3);
                            } else {
                                c4234l2 = null;
                            }
                            if (c4234l2 != null) {
                                i2 = (c16272l7.isPro + c4234l2.f20477l) - ((C4234l) abstractC1186l.get(0)).f20477l;
                            }
                        }
                        i4 = i2;
                    }
                    c8413l = null;
                    c16272l4 = new C16272l(c16272l.amazon, c16272l.yandex, c16272l.loadAd, c16272l.purchase, c16272l.mopub, j7, true, i4, c16272l.firebase, c16272l.smaato, c16272l.remoteconfig, c16272l.vip, c16272l.crashlytics, c16272l.metrica, c16272l.startapp, c16272l.adcel, abstractC1186l, c16272l.subscription, c16272l.license, c16272l.tapsense, c16272l.pro, c16272l.ad);
                }
                j7 = j6;
                if (c16272l.subs) {
                    i4 = c16272l.isPro;
                } else {
                    c16272l3 = c6827l.f14263l;
                    if (c16272l3 != null) {
                        i2 = c16272l3.isPro;
                    } else {
                        i2 = 0;
                    }
                    if (c16272l7 == null) {
                        i3 = (int) (j - c16272l7.firebase);
                        abstractC1186l3 = c16272l7.ads;
                        if (i3 < abstractC1186l3.size()) {
                            c4234l2 = (C4234l) abstractC1186l3.get(i3);
                        } else {
                            c4234l2 = null;
                        }
                        if (c4234l2 != null) {
                            i2 = (c16272l7.isPro + c4234l2.f20477l) - ((C4234l) abstractC1186l.get(0)).f20477l;
                        }
                    }
                    i4 = i2;
                }
                c8413l = null;
                c16272l4 = new C16272l(c16272l.amazon, c16272l.yandex, c16272l.loadAd, c16272l.purchase, c16272l.mopub, j7, true, i4, c16272l.firebase, c16272l.smaato, c16272l.remoteconfig, c16272l.vip, c16272l.crashlytics, c16272l.metrica, c16272l.startapp, c16272l.adcel, abstractC1186l, c16272l.subscription, c16272l.license, c16272l.tapsense, c16272l.pro, c16272l.ad);
            } else {
                if (c16272l.metrica) {
                    z2 = true;
                    c16272l4 = c16272l7;
                } else if (c16272l7.metrica) {
                    c16272l4 = c16272l7;
                    copyOnWriteArrayList = copyOnWriteArrayList;
                    c8413l = null;
                    z2 = true;
                } else {
                    z2 = true;
                    c16272l4 = new C16272l(c16272l7.amazon, c16272l7.yandex, c16272l7.loadAd, c16272l7.purchase, c16272l7.mopub, c16272l7.admob, c16272l7.subs, c16272l7.isPro, c16272l7.firebase, c16272l7.smaato, c16272l7.remoteconfig, c16272l7.vip, c16272l7.crashlytics, true, c16272l7.startapp, c16272l7.adcel, c16272l7.ads, c16272l7.subscription, c16272l7.license, c16272l7.tapsense, c16272l7.pro, c16272l7.ad);
                }
                c8413l = null;
            }
            this.f32171l = c16272l4;
            uri = this.f32169l;
            if (c16272l4 != c16272l7) {
                this.f32176l = c8413l;
                this.f32166l = jElapsedRealtime;
                if (uri.equals(c6827l.f14259l)) {
                    if (c6827l.f14263l == null) {
                        c6827l.f14273l = !c16272l4.metrica;
                        c6827l.f14262l = c16272l4.admob;
                    }
                    c6827l.f14263l = c16272l4;
                    c6827l.f14269l.Signature(c16272l4);
                }
                it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC17649l) it2.next()).yandex();
                }
            } else if (!c16272l4.metrica) {
                size2 = c16272l.firebase + ((long) c16272l.ads.size());
                c16272l5 = this.f32171l;
                if (size2 < c16272l5.firebase) {
                    c8413l2 = new C8413l();
                    z3 = z2;
                } else {
                    if (jElapsedRealtime - this.f32166l > AbstractC15323l.m3986try(c16272l5.remoteconfig) * 3.5d) {
                        c8413l2 = new C8413l();
                    } else {
                        c8413l2 = c8413l;
                    }
                    z3 = false;
                }
                if (c8413l2 != null) {
                    this.f32176l = c8413l2;
                    c14785l = new C14785l(c8413l2, z2 ? 1 : 0, 14);
                    it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC17649l) it.next()).loadAd(uri, c14785l, z3);
                    }
                }
            }
            c16272l6 = this.f32171l;
            c7043l = c16272l6.license;
            j8 = c16272l6.remoteconfig;
            if (!c7043l.purchase) {
                if (c16272l6 == c16272l7) {
                    j9 = c16272l6.vip;
                    if (j9 != -9223372036854775807L) {
                        j2 = j9 / 2;
                    } else {
                        j8 /= 2;
                    }
                }
                this.f32167l = (AbstractC15323l.m3986try(j2) + jElapsedRealtime) - c13071l.purchase;
                if (this.f32171l.metrica) {
                }
                if (!uri.equals(c6827l.f14259l) || this.f32173l) {
                    purchase(yandex());
                }
                return;
            }
            if (c16272l6 == c16272l7) {
                j8 /= 2;
            }
            j2 = j8;
            this.f32167l = (AbstractC15323l.m3986try(j2) + jElapsedRealtime) - c13071l.purchase;
            if (this.f32171l.metrica) {
                if (uri.equals(c6827l.f14259l)) {
                }
                purchase(yandex());
            }
        }
        c16272l.getClass();
        j = c16272l.firebase;
        abstractC1186l = c16272l.ads;
        j2 = 0;
        if (z) {
            if (c16272l.metrica) {
                z2 = true;
                c16272l4 = c16272l7;
            } else if (c16272l7.metrica) {
                c16272l4 = c16272l7;
                copyOnWriteArrayList = copyOnWriteArrayList;
                c8413l = null;
                z2 = true;
            } else {
                z2 = true;
                c16272l4 = new C16272l(c16272l7.amazon, c16272l7.yandex, c16272l7.loadAd, c16272l7.purchase, c16272l7.mopub, c16272l7.admob, c16272l7.subs, c16272l7.isPro, c16272l7.firebase, c16272l7.smaato, c16272l7.remoteconfig, c16272l7.vip, c16272l7.crashlytics, true, c16272l7.startapp, c16272l7.adcel, c16272l7.ads, c16272l7.subscription, c16272l7.license, c16272l7.tapsense, c16272l7.pro, c16272l7.ad);
            }
            c8413l = null;
        } else {
            copyOnWriteArrayList = copyOnWriteArrayList;
            z2 = true;
            if (c16272l.startapp) {
                j6 = c16272l.admob;
            } else {
                c16272l2 = c6827l.f14263l;
                if (c16272l2 != null) {
                    j3 = c16272l2.admob;
                } else {
                    j3 = 0;
                }
                if (c16272l7 == null) {
                    long j13 = c16272l7.admob;
                    j4 = c16272l7.firebase;
                    abstractC1186l2 = c16272l7.ads;
                    size = abstractC1186l2.size();
                    i = (int) (j - j4);
                    if (i < abstractC1186l2.size()) {
                        c4234l = (C4234l) abstractC1186l2.get(i);
                    } else {
                        c4234l = null;
                    }
                    if (c4234l != null) {
                        j5 = c4234l.f20476l;
                    } else {
                        if (size == j - j4) {
                            j5 = c16272l7.Signature;
                        }
                        if (c16272l.subs) {
                            i4 = c16272l.isPro;
                        } else {
                            c16272l3 = c6827l.f14263l;
                            if (c16272l3 != null) {
                                i2 = c16272l3.isPro;
                            } else {
                                i2 = 0;
                            }
                            if (c16272l7 == null) {
                                i3 = (int) (j - c16272l7.firebase);
                                abstractC1186l3 = c16272l7.ads;
                                if (i3 < abstractC1186l3.size()) {
                                    c4234l2 = (C4234l) abstractC1186l3.get(i3);
                                } else {
                                    c4234l2 = null;
                                }
                                if (c4234l2 != null) {
                                    i2 = (c16272l7.isPro + c4234l2.f20477l) - ((C4234l) abstractC1186l.get(0)).f20477l;
                                }
                            }
                            i4 = i2;
                        }
                        c8413l = null;
                        c16272l4 = new C16272l(c16272l.amazon, c16272l.yandex, c16272l.loadAd, c16272l.purchase, c16272l.mopub, j7, true, i4, c16272l.firebase, c16272l.smaato, c16272l.remoteconfig, c16272l.vip, c16272l.crashlytics, c16272l.metrica, c16272l.startapp, c16272l.adcel, abstractC1186l, c16272l.subscription, c16272l.license, c16272l.tapsense, c16272l.pro, c16272l.ad);
                    }
                    j6 = j13 + j5;
                }
                j7 = j3;
                if (c16272l.subs) {
                    i4 = c16272l.isPro;
                } else {
                    c16272l3 = c6827l.f14263l;
                    if (c16272l3 != null) {
                        i2 = c16272l3.isPro;
                    } else {
                        i2 = 0;
                    }
                    if (c16272l7 == null) {
                        i3 = (int) (j - c16272l7.firebase);
                        abstractC1186l3 = c16272l7.ads;
                        if (i3 < abstractC1186l3.size()) {
                            c4234l2 = (C4234l) abstractC1186l3.get(i3);
                        } else {
                            c4234l2 = null;
                        }
                        if (c4234l2 != null) {
                            i2 = (c16272l7.isPro + c4234l2.f20477l) - ((C4234l) abstractC1186l.get(0)).f20477l;
                        }
                    }
                    i4 = i2;
                }
                c8413l = null;
                c16272l4 = new C16272l(c16272l.amazon, c16272l.yandex, c16272l.loadAd, c16272l.purchase, c16272l.mopub, j7, true, i4, c16272l.firebase, c16272l.smaato, c16272l.remoteconfig, c16272l.vip, c16272l.crashlytics, c16272l.metrica, c16272l.startapp, c16272l.adcel, abstractC1186l, c16272l.subscription, c16272l.license, c16272l.tapsense, c16272l.pro, c16272l.ad);
            }
            j7 = j6;
            if (c16272l.subs) {
                i4 = c16272l.isPro;
            } else {
                c16272l3 = c6827l.f14263l;
                if (c16272l3 != null) {
                    i2 = c16272l3.isPro;
                } else {
                    i2 = 0;
                }
                if (c16272l7 == null) {
                    i3 = (int) (j - c16272l7.firebase);
                    abstractC1186l3 = c16272l7.ads;
                    if (i3 < abstractC1186l3.size()) {
                        c4234l2 = (C4234l) abstractC1186l3.get(i3);
                    } else {
                        c4234l2 = null;
                    }
                    if (c4234l2 != null) {
                        i2 = (c16272l7.isPro + c4234l2.f20477l) - ((C4234l) abstractC1186l.get(0)).f20477l;
                    }
                }
                i4 = i2;
            }
            c8413l = null;
            c16272l4 = new C16272l(c16272l.amazon, c16272l.yandex, c16272l.loadAd, c16272l.purchase, c16272l.mopub, j7, true, i4, c16272l.firebase, c16272l.smaato, c16272l.remoteconfig, c16272l.vip, c16272l.crashlytics, c16272l.metrica, c16272l.startapp, c16272l.adcel, abstractC1186l, c16272l.subscription, c16272l.license, c16272l.tapsense, c16272l.pro, c16272l.ad);
        }
        this.f32171l = c16272l4;
        uri = this.f32169l;
        if (c16272l4 != c16272l7) {
            this.f32176l = c8413l;
            this.f32166l = jElapsedRealtime;
            if (uri.equals(c6827l.f14259l)) {
                if (c6827l.f14263l == null) {
                    c6827l.f14273l = !c16272l4.metrica;
                    c6827l.f14262l = c16272l4.admob;
                }
                c6827l.f14263l = c16272l4;
                c6827l.f14269l.Signature(c16272l4);
            }
            it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC17649l) it2.next()).yandex();
            }
        } else if (!c16272l4.metrica) {
            size2 = c16272l.firebase + ((long) c16272l.ads.size());
            c16272l5 = this.f32171l;
            if (size2 < c16272l5.firebase) {
                c8413l2 = new C8413l();
                z3 = z2;
            } else {
                if (jElapsedRealtime - this.f32166l > AbstractC15323l.m3986try(c16272l5.remoteconfig) * 3.5d) {
                    c8413l2 = new C8413l();
                } else {
                    c8413l2 = c8413l;
                }
                z3 = false;
            }
            if (c8413l2 != null) {
                this.f32176l = c8413l2;
                c14785l = new C14785l(c8413l2, z2 ? 1 : 0, 14);
                it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC17649l) it.next()).loadAd(uri, c14785l, z3);
                }
            }
        }
        c16272l6 = this.f32171l;
        c7043l = c16272l6.license;
        j8 = c16272l6.remoteconfig;
        if (!c7043l.purchase) {
            if (c16272l6 == c16272l7) {
                j9 = c16272l6.vip;
                if (j9 != -9223372036854775807L) {
                    j2 = j9 / 2;
                } else {
                    j8 /= 2;
                }
            }
            this.f32167l = (AbstractC15323l.m3986try(j2) + jElapsedRealtime) - c13071l.purchase;
            if (this.f32171l.metrica) {
                if (uri.equals(c6827l.f14259l)) {
                }
                purchase(yandex());
            }
        }
        if (c16272l6 == c16272l7) {
            j8 /= 2;
        }
        j2 = j8;
        this.f32167l = (AbstractC15323l.m3986try(j2) + jElapsedRealtime) - c13071l.purchase;
        if (this.f32171l.metrica) {
            if (uri.equals(c6827l.f14259l)) {
            }
            purchase(yandex());
        }
    }

    @Override // defpackage.InterfaceC7548l
    public final void crashlytics(InterfaceC13131l interfaceC13131l, long j, long j2) {
        C14431l c14431l = (C14431l) interfaceC13131l;
        AbstractC2712l abstractC2712l = (AbstractC2712l) c14431l.billing;
        C2432l c2432l = c14431l.loadAd;
        C13384l c13384l = c14431l.amazon;
        C13071l c13071l = new C13071l(c2432l, c13384l.f26265l, c13384l.f26268l, j, j2, c13384l.f26266l);
        if (abstractC2712l instanceof C16272l) {
            billing((C16272l) abstractC2712l, c13071l);
            this.f32164l.f14270l.m3677native(c13071l, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            C17655l c17655lLoadAd = C17655l.loadAd("Loaded playlist has unexpected type.");
            this.f32176l = c17655lLoadAd;
            this.f32164l.f14270l.m3680private(c13071l, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, c17655lLoadAd, true);
        }
        this.f32164l.f14256l.getClass();
    }

    @Override // defpackage.InterfaceC7548l
    public final void loadAd(InterfaceC13131l interfaceC13131l, long j, long j2, boolean z) {
        C14431l c14431l = (C14431l) interfaceC13131l;
        long j3 = c14431l.yandex;
        C2432l c2432l = c14431l.loadAd;
        C13384l c13384l = c14431l.amazon;
        C13071l c13071l = new C13071l(c2432l, c13384l.f26265l, c13384l.f26268l, j, j2, c13384l.f26266l);
        C6827l c6827l = this.f32164l;
        c6827l.f14256l.getClass();
        c6827l.f14270l.m3685volatile(c13071l, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void purchase(Uri uri) {
        this.f32174l = 0L;
        if (this.f32170l) {
            return;
        }
        C18449l c18449l = this.f32165l;
        if (c18449l.m4537catch() || ((IOException) c18449l.f36012l) != null) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f32167l;
        if (jElapsedRealtime >= j) {
            amazon(uri);
        } else {
            this.f32170l = true;
            this.f32164l.f14258l.postDelayed(new RunnableC0336l(this, uri, 1), j - jElapsedRealtime);
        }
    }

    @Override // defpackage.InterfaceC7548l
    public final void smaato(InterfaceC13131l interfaceC13131l, long j, long j2, int i) {
        C13071l c13071l;
        C14431l c14431l = (C14431l) interfaceC13131l;
        if (i == 0) {
            long j3 = c14431l.yandex;
            c13071l = new C13071l(c14431l.loadAd, j);
        } else {
            long j4 = c14431l.yandex;
            C2432l c2432l = c14431l.loadAd;
            C13384l c13384l = c14431l.amazon;
            c13071l = new C13071l(c2432l, c13384l.f26265l, c13384l.f26268l, j, j2, c13384l.f26266l);
        }
        this.f32164l.f14270l.m3674for(c13071l, c14431l.crashlytics, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    public final Uri yandex() {
        C16272l c16272l = this.f32171l;
        Uri uri = this.f32169l;
        if (c16272l != null) {
            C7043l c7043l = c16272l.license;
            if (c7043l.yandex != -9223372036854775807L || c7043l.purchase) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                C16272l c16272l2 = this.f32171l;
                if (c16272l2.license.purchase) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c16272l2.firebase + ((long) c16272l2.ads.size())));
                    C16272l c16272l3 = this.f32171l;
                    if (c16272l3.vip != -9223372036854775807L) {
                        AbstractC1186l abstractC1186l = c16272l3.subscription;
                        int size = abstractC1186l.size();
                        if (!abstractC1186l.isEmpty() && ((C6823l) AbstractC11356l.purchase(abstractC1186l)).f14248l) {
                            size--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                C7043l c7043l2 = this.f32171l.license;
                if (c7043l2.yandex != -9223372036854775807L) {
                    builderBuildUpon.appendQueryParameter("_HLS_skip", c7043l2.loadAd ? "v2" : "YES");
                }
                return builderBuildUpon.build();
            }
        }
        return uri;
    }
}
