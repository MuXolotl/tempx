package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: lؙۡۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6827l implements InterfaceC7548l {

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final C18262l f14254l = new C18262l(7);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public AbstractC1186l f14255l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C14513l f14256l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C18449l f14257l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Handler f14258l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public Uri f14259l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC12873l f14260l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C1770l f14261l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public C16272l f14263l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public C9887l f14264l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public AbstractC1186l f14265l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public AbstractC1186l f14268l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public C12149l f14269l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C13698l f14270l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public C17655l f14271l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public AbstractC1186l f14272l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public boolean f14273l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f14266l = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final HashMap f14267l = new HashMap();

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public long f14262l = -9223372036854775807L;

    public C6827l(C1770l c1770l, C14513l c14513l, InterfaceC12873l interfaceC12873l) {
        this.f14261l = c1770l;
        this.f14260l = interfaceC12873l;
        this.f14256l = c14513l;
    }

    @Override // defpackage.InterfaceC7548l
    public final C8128l Signature(InterfaceC13131l interfaceC13131l, long j, long j2, IOException iOException, int i) {
        long jMin;
        C14431l c14431l = (C14431l) interfaceC13131l;
        long j3 = c14431l.yandex;
        C2432l c2432l = c14431l.loadAd;
        C13384l c13384l = c14431l.amazon;
        C13071l c13071l = new C13071l(c2432l, c13384l.f26265l, c13384l.f26268l, j, j2, c13384l.f26266l);
        int i2 = c14431l.crashlytics;
        C14513l c14513l = this.f14256l;
        c14513l.getClass();
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof C17655l) || (cause instanceof FileNotFoundException) || (cause instanceof C7825l) || (cause instanceof C12971l) || ((cause instanceof C12126l) && ((C12126l) cause).f24145l == 2008)) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        boolean z = jMin == -9223372036854775807L;
        long j4 = jMin;
        this.f14270l.m3680private(c13071l, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        if (z) {
            c14513l.getClass();
        }
        return z ? C18449l.f36007l : new C8128l(0, j4, false);
    }

    public final boolean admob(Uri uri) {
        int i;
        C16293l c16293l = (C16293l) this.f14267l.get(uri);
        if (c16293l == null) {
            return false;
        }
        C16456l c16456l = (C16456l) AbstractC2812l.adcel(c16293l.loadAd, uri, uri);
        c16456l.getClass();
        if (c16456l.f32171l == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, AbstractC15323l.m3986try(c16456l.f32171l.Signature));
        C16272l c16272l = c16456l.f32171l;
        return c16272l.metrica || (i = c16272l.amazon) == 2 || i == 1 || c16456l.f32175l + jMax > jElapsedRealtime;
    }

    public final C16272l amazon(boolean z, Uri uri) {
        HashMap map = this.f14267l;
        C16293l c16293l = (C16293l) map.get(uri);
        if (c16293l == null) {
            return null;
        }
        C16272l c16272lYandex = C16293l.yandex(c16293l, uri);
        if (c16272lYandex != null && z) {
            subs(uri);
            C16293l c16293l2 = (C16293l) map.get(uri);
            c16293l2.getClass();
            HashMap map2 = c16293l2.loadAd;
            C16456l c16456l = (C16456l) AbstractC2812l.adcel(map2, uri, uri);
            c16456l.getClass();
            if (!c16456l.f32173l) {
                C16456l c16456l2 = (C16456l) AbstractC2812l.adcel(map2, uri, uri);
                c16456l2.getClass();
                c16456l2.f32173l = true;
                C16272l c16272lYandex2 = C16293l.yandex(c16293l2, uri);
                if (c16272lYandex2 != null && !c16272lYandex2.metrica) {
                    C16293l.loadAd(c16293l2, uri, true);
                }
            }
        }
        return c16272lYandex;
    }

    public final Uri billing(Uri uri) {
        C0236l c0236l;
        C16272l c16272l = this.f14263l;
        if (c16272l == null || !c16272l.license.purchase || (c0236l = (C0236l) c16272l.tapsense.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c0236l.loadAd));
        int i = c0236l.crashlytics;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    @Override // defpackage.InterfaceC7548l
    public final void crashlytics(InterfaceC13131l interfaceC13131l, long j, long j2) {
        C9887l c9887l;
        C14431l c14431l = (C14431l) interfaceC13131l;
        AbstractC2712l abstractC2712l = (AbstractC2712l) c14431l.billing;
        boolean z = abstractC2712l instanceof C16272l;
        if (z) {
            String str = abstractC2712l.yandex;
            C9887l c9887l2 = C9887l.smaato;
            Uri uri = Uri.parse(str);
            C12984l c12984l = new C12984l();
            c12984l.yandex = "0";
            c12984l.remoteconfig = AbstractC3825l.vip("application/x-mpegURL");
            List listSingletonList = Collections.singletonList(new C15979l(uri, new C5978l(c12984l), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            c9887l = new C9887l("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            c9887l = (C9887l) abstractC2712l;
        }
        this.f14264l = c9887l;
        try {
            this.f14268l = C16091l.loadAd(c9887l.amazon);
            this.f14255l = C16091l.yandex(c9887l.purchase);
            this.f14272l = C16091l.yandex(c9887l.billing);
            this.f14265l = C16091l.yandex(c9887l.mopub);
            this.f14259l = ((C16091l) this.f14268l.get(0)).crashlytics();
            this.f14266l.add(new C15741l(this));
            yandex(this.f14268l);
            yandex(this.f14255l);
            yandex(this.f14272l);
            yandex(this.f14265l);
            C2432l c2432l = c14431l.loadAd;
            C13384l c13384l = c14431l.amazon;
            C13071l c13071l = new C13071l(c2432l, c13384l.f26265l, c13384l.f26268l, j, j2, c13384l.f26266l);
            C16293l c16293l = (C16293l) this.f14267l.get(this.f14259l);
            c16293l.getClass();
            if (z) {
                Uri uri2 = c14431l.amazon.f26265l;
                C16456l c16456l = (C16456l) AbstractC2812l.adcel(c16293l.loadAd, uri2, uri2);
                c16456l.getClass();
                c16456l.billing((C16272l) abstractC2712l, c13071l);
            } else {
                C16293l.loadAd(c16293l, this.f14259l, false);
            }
            this.f14256l.getClass();
            this.f14270l.m3677native(c13071l, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (C17655l e) {
            this.f14271l = e;
        }
    }

    public final void isPro(Uri uri) {
        C16293l c16293l = (C16293l) this.f14267l.get(uri);
        if (c16293l != null) {
            C16456l c16456l = (C16456l) AbstractC2812l.adcel(c16293l.loadAd, uri, uri);
            c16456l.getClass();
            C18449l c18449l = c16456l.f32165l;
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
            IOException iOException3 = c16456l.f32176l;
            if (iOException3 != null) {
                throw iOException3;
            }
        }
    }

    @Override // defpackage.InterfaceC7548l
    public final void loadAd(InterfaceC13131l interfaceC13131l, long j, long j2, boolean z) {
        C14431l c14431l = (C14431l) interfaceC13131l;
        long j3 = c14431l.yandex;
        C2432l c2432l = c14431l.loadAd;
        C13384l c13384l = c14431l.amazon;
        C13071l c13071l = new C13071l(c2432l, c13384l.f26265l, c13384l.f26268l, j, j2, c13384l.f26266l);
        this.f14256l.getClass();
        this.f14270l.m3685volatile(c13071l, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final boolean mopub(C16091l c16091l, long j) {
        C16293l c16293l = (C16293l) this.f14267l.get(c16091l.crashlytics());
        if (c16293l == null) {
            return false;
        }
        Iterator it = c16293l.loadAd.values().iterator();
        boolean z = true;
        while (it.hasNext()) {
            z &= j <= ((C16456l) it.next()).f32174l;
        }
        return z;
    }

    public final AbstractC1186l purchase(int i) {
        if (i == 0) {
            return this.f14268l;
        }
        if (i == 1) {
            return this.f14255l;
        }
        if (i == 2) {
            return this.f14272l;
        }
        if (i != 3) {
            return null;
        }
        return this.f14265l;
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
        this.f14270l.m3674for(c13071l, c14431l.crashlytics, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    public final void subs(Uri uri) {
        if (uri.equals(this.f14259l)) {
            return;
        }
        List list = this.f14264l.amazon;
        for (int i = 0; i < list.size(); i++) {
            if (uri.equals(((C15979l) list.get(i)).yandex)) {
                C16272l c16272l = this.f14263l;
                if (c16272l == null || !c16272l.metrica) {
                    this.f14259l = uri;
                    C16293l c16293l = (C16293l) this.f14267l.get(uri);
                    c16293l.getClass();
                    C16272l c16272lYandex = C16293l.yandex(c16293l, uri);
                    if (c16272lYandex != null && c16272lYandex.metrica) {
                        this.f14263l = c16272lYandex;
                        this.f14269l.Signature(c16272lYandex);
                        return;
                    } else {
                        Uri uriBilling = billing(uri);
                        C16456l c16456l = (C16456l) AbstractC2812l.adcel(c16293l.loadAd, uri, uri);
                        c16456l.getClass();
                        c16456l.purchase(uriBilling);
                        return;
                    }
                }
                return;
            }
        }
    }

    public final void yandex(List list) {
        for (int i = 0; i < list.size(); i++) {
            C16091l c16091l = (C16091l) list.get(i);
            C16293l c16293l = new C16293l(this, c16091l);
            AbstractC10199l it = AbstractC8481l.ads(c16091l.loadAd.values()).iterator();
            while (it.hasNext()) {
                this.f14267l.put((Uri) it.next(), c16293l);
            }
        }
    }
}
