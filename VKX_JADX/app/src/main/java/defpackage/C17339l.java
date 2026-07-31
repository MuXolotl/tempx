package defpackage;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: lٕٗۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17339l implements InterfaceC0729l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public C17849l f33677l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final Set f33678l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C11919l f33679l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f33680l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public byte[] f33681l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public Handler f33682l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C3797l f33683l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public InterfaceC6553l f33684l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C18262l f33685l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final UUID f33686l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public Looper f33687l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public C15034l f33688l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C10975l f33689l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public int f33690l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f33691l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final HashMap f33692l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final ArrayList f33693l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C14513l f33694l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final int[] f33695l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final long f33696l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final Set f33697l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public C15034l f33698l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public volatile HandlerC8616l f33699l;

    public C17339l(UUID uuid, C11919l c11919l, HashMap map, boolean z, int[] iArr, boolean z2, C14513l c14513l) {
        uuid.getClass();
        AbstractC12442l.subs(!AbstractC17252l.crashlytics.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f33686l = uuid;
        this.f33685l = C14540l.f28478l;
        this.f33679l = c11919l;
        this.f33692l = map;
        this.f33691l = z;
        this.f33695l = iArr;
        this.f33680l = z2;
        this.f33694l = c14513l;
        this.f33683l = new C3797l(15);
        this.f33689l = new C10975l(8, this);
        this.f33693l = new ArrayList();
        this.f33678l = Collections.newSetFromMap(new IdentityHashMap());
        this.f33697l = Collections.newSetFromMap(new IdentityHashMap());
        this.f33696l = 300000L;
    }

    public static ArrayList admob(C17564l c17564l, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(c17564l.f34191l);
        for (int i = 0; i < c17564l.f34191l; i++) {
            C12687l c12687l = c17564l.f34190l[i];
            if ((c12687l.yandex(uuid) || (AbstractC17252l.amazon.equals(uuid) && c12687l.yandex(AbstractC17252l.crashlytics))) && (c12687l.f25010l != null || z)) {
                arrayList.add(c12687l);
            }
        }
        return arrayList;
    }

    public static boolean purchase(C15034l c15034l) {
        c15034l.startapp();
        if (c15034l.startapp != 1) {
            return false;
        }
        C4684l c4684lMopub = c15034l.mopub();
        c4684lMopub.getClass();
        Throwable cause = c4684lMopub.getCause();
        return (cause instanceof ResourceBusyException) || AbstractC16670l.isPro(cause);
    }

    @Override // defpackage.InterfaceC0729l
    public final InterfaceC12888l amazon(C13281l c13281l, C5978l c5978l) {
        int i = 0;
        AbstractC12442l.subscription(this.f33690l > 0);
        this.f33687l.getClass();
        C7115l c7115l = new C7115l(this, c13281l);
        Handler handler = this.f33682l;
        handler.getClass();
        handler.post(new RunnableC0336l(c7115l, c5978l, i));
        return c7115l;
    }

    public final C15034l billing(List list, boolean z, C13281l c13281l) {
        this.f33684l.getClass();
        boolean z2 = this.f33680l | z;
        InterfaceC6553l interfaceC6553l = this.f33684l;
        byte[] bArr = this.f33681l;
        Looper looper = this.f33687l;
        looper.getClass();
        C17849l c17849l = this.f33677l;
        c17849l.getClass();
        C15034l c15034l = new C15034l(this.f33686l, interfaceC6553l, this.f33683l, this.f33689l, list, z2, z, bArr, this.f33692l, this.f33679l, looper, this.f33694l, c17849l);
        c15034l.purchase(c13281l);
        if (this.f33696l != -9223372036854775807L) {
            c15034l.purchase(null);
        }
        return c15034l;
    }

    @Override // defpackage.InterfaceC0729l
    public final InterfaceC9655l crashlytics(C13281l c13281l, C5978l c5978l) {
        isPro(false);
        AbstractC12442l.subscription(this.f33690l > 0);
        this.f33687l.getClass();
        return loadAd(this.f33687l, c13281l, c5978l, true);
    }

    @Override // defpackage.InterfaceC0729l
    public final void firebase(Looper looper, C17849l c17849l) {
        synchronized (this) {
            try {
                Looper looper2 = this.f33687l;
                if (looper2 == null) {
                    this.f33687l = looper;
                    this.f33682l = new Handler(looper);
                } else {
                    AbstractC12442l.subscription(looper2 == looper);
                    this.f33682l.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f33677l = c17849l;
    }

    public final void isPro(boolean z) {
        if (z && this.f33687l == null) {
            AbstractC6427l.metrica("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f33687l;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            AbstractC6427l.metrica("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f33687l.getThread().getName(), new IllegalStateException());
        }
    }

    public final InterfaceC9655l loadAd(Looper looper, C13281l c13281l, C5978l c5978l, boolean z) {
        ArrayList arrayListAdmob;
        if (this.f33699l == null) {
            this.f33699l = new HandlerC8616l(this, looper, 2);
        }
        C17564l c17564l = c5978l.subscription;
        int i = 0;
        C15034l c15034l = null;
        if (c17564l == null) {
            int iAdmob = AbstractC3825l.admob(c5978l.metrica);
            InterfaceC6553l interfaceC6553l = this.f33684l;
            interfaceC6553l.getClass();
            if (interfaceC6553l.adcel() != 2 || !C11102l.crashlytics) {
                int[] iArr = this.f33695l;
                while (true) {
                    if (i >= iArr.length) {
                        i = -1;
                        break;
                    }
                    if (iArr[i] == iAdmob) {
                        break;
                    }
                    i++;
                }
                if (i != -1 && interfaceC6553l.adcel() != 1) {
                    C15034l c15034l2 = this.f33688l;
                    if (c15034l2 == null) {
                        C9258l c9258l = AbstractC1186l.f3181l;
                        C15034l c15034lMopub = mopub(C13708l.f26763l, true, null, z);
                        this.f33693l.add(c15034lMopub);
                        this.f33688l = c15034lMopub;
                    } else {
                        c15034l2.purchase(null);
                    }
                    return this.f33688l;
                }
            }
            return null;
        }
        if (this.f33681l == null) {
            arrayListAdmob = admob(c17564l, this.f33686l, false);
            if (arrayListAdmob.isEmpty()) {
                C13976l c13976l = new C13976l("Media does not support uuid: " + this.f33686l);
                AbstractC6427l.subs("DefaultDrmSessionMgr", "DRM error", c13976l);
                c13281l.amazon(c13976l);
                return new C5269l(new C4684l(6003, c13976l));
            }
        } else {
            arrayListAdmob = null;
        }
        if (this.f33691l) {
            for (C15034l c15034l3 : this.f33693l) {
                if (Objects.equals(c15034l3.yandex, arrayListAdmob)) {
                    c15034l = c15034l3;
                    break;
                }
            }
        } else {
            c15034l = this.f33698l;
        }
        if (c15034l != null) {
            c15034l.purchase(c13281l);
            return c15034l;
        }
        C15034l c15034lMopub2 = mopub(arrayListAdmob, false, c13281l, z);
        if (!this.f33691l) {
            this.f33698l = c15034lMopub2;
        }
        this.f33693l.add(c15034lMopub2);
        return c15034lMopub2;
    }

    public final C15034l mopub(List list, boolean z, C13281l c13281l, boolean z2) {
        C15034l c15034lBilling = billing(list, z, c13281l);
        boolean zPurchase = purchase(c15034lBilling);
        long j = this.f33696l;
        Set set = this.f33697l;
        if (zPurchase && !set.isEmpty()) {
            AbstractC10199l it = AbstractC8481l.ads(set).iterator();
            while (it.hasNext()) {
                ((InterfaceC9655l) it.next()).amazon(null);
            }
            c15034lBilling.amazon(c13281l);
            if (j != -9223372036854775807L) {
                c15034lBilling.amazon(null);
            }
            c15034lBilling = billing(list, z, c13281l);
        }
        if (purchase(c15034lBilling) && z2) {
            Set set2 = this.f33678l;
            if (!set2.isEmpty()) {
                AbstractC10199l it2 = AbstractC8481l.ads(set2).iterator();
                while (it2.hasNext()) {
                    ((C7115l) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    AbstractC10199l it3 = AbstractC8481l.ads(set).iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC9655l) it3.next()).amazon(null);
                    }
                }
                c15034lBilling.amazon(c13281l);
                if (j != -9223372036854775807L) {
                    c15034lBilling.amazon(null);
                }
                return billing(list, z, c13281l);
            }
        }
        return c15034lBilling;
    }

    @Override // defpackage.InterfaceC0729l
    public final void release() {
        isPro(true);
        int i = this.f33690l - 1;
        this.f33690l = i;
        if (i != 0) {
            return;
        }
        if (this.f33696l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f33693l);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((C15034l) arrayList.get(i2)).amazon(null);
            }
        }
        AbstractC10199l it = AbstractC8481l.ads(this.f33678l).iterator();
        while (it.hasNext()) {
            ((C7115l) it.next()).release();
        }
        subs();
    }

    @Override // defpackage.InterfaceC0729l
    public final int smaato(C5978l c5978l) {
        isPro(false);
        InterfaceC6553l interfaceC6553l = this.f33684l;
        interfaceC6553l.getClass();
        int iAdcel = interfaceC6553l.adcel();
        C17564l c17564l = c5978l.subscription;
        if (c17564l == null) {
            int iAdmob = AbstractC3825l.admob(c5978l.metrica);
            int i = 0;
            while (true) {
                int[] iArr = this.f33695l;
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == iAdmob) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return 0;
            }
        } else if (this.f33681l == null) {
            UUID uuid = this.f33686l;
            if (admob(c17564l, uuid, true).isEmpty()) {
                if (c17564l.f34191l == 1 && c17564l.f34190l[0].yandex(AbstractC17252l.crashlytics)) {
                    AbstractC6427l.vip("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = c17564l.f34188l;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : Build.VERSION.SDK_INT < 25)) {
                return 1;
            }
        }
        return iAdcel;
    }

    public final void subs() {
        if (this.f33684l != null && this.f33690l == 0 && this.f33693l.isEmpty() && this.f33678l.isEmpty()) {
            InterfaceC6553l interfaceC6553l = this.f33684l;
            interfaceC6553l.getClass();
            interfaceC6553l.release();
            this.f33684l = null;
        }
    }

    @Override // defpackage.InterfaceC0729l
    public final void yandex() {
        InterfaceC6553l c2582l;
        isPro(true);
        int i = this.f33690l;
        this.f33690l = i + 1;
        if (i != 0) {
            return;
        }
        int i2 = 0;
        if (this.f33684l == null) {
            UUID uuid = this.f33686l;
            this.f33685l.getClass();
            try {
                try {
                    c2582l = new C14540l(uuid);
                } catch (UnsupportedSchemeException e) {
                    throw new C18628l(e);
                } catch (Exception e2) {
                    throw new C18628l(e2);
                }
            } catch (C18628l unused) {
                AbstractC6427l.admob("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                c2582l = new C2582l(0);
            }
            this.f33684l = c2582l;
            c2582l.loadAd(new C7972l(8, this));
            return;
        }
        if (this.f33696l == -9223372036854775807L) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.f33693l;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((C15034l) arrayList.get(i2)).purchase(null);
            i2++;
        }
    }
}
