package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import kotlin.Unit;

/* JADX INFO: renamed from: lؘؑ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0374l implements InterfaceC1361l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public IOException f1449l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C0386l f1450l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f1451l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C17982l f1452l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C8050l f1453l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f1454l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C2539l f1455l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public long f1456l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public long f1457l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f1458l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C17573l f1459l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final ArrayDeque f1460l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C2539l f1461l;

    public C0374l(int i, C8050l c8050l, boolean z, boolean z2, C8309l c8309l) {
        this.f1454l = i;
        this.f1453l = c8050l;
        this.f1450l = new C0386l(i);
        this.f1456l = c8050l.f16776l.yandex();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f1460l = arrayDeque;
        this.f1452l = new C17982l(this, c8050l.f16765l.yandex(), z2);
        this.f1459l = new C17573l(this, z);
        this.f1455l = new C2539l(this);
        this.f1461l = new C2539l(this);
        if (c8309l == null) {
            if (admob()) {
                return;
            }
            C8339l.smaato("remotely-initiated streams should have headers");
            throw null;
        }
        if (admob()) {
            C8339l.smaato("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(c8309l);
    }

    public final boolean admob() {
        boolean z = (this.f1454l & 1) == 1;
        this.f1453l.getClass();
        return true == z;
    }

    public final boolean amazon(int i, IOException iOException) {
        TimeZone timeZone = AbstractC11432l.yandex;
        synchronized (this) {
            if (mopub() != 0) {
                return false;
            }
            this.f1458l = i;
            this.f1449l = iOException;
            notifyAll();
            if (this.f1452l.f35153l && this.f1459l.f34199l) {
                return false;
            }
            Unit unit = Unit.INSTANCE;
            this.f1453l.vip(this.f1454l);
            return true;
        }
    }

    @Override // defpackage.InterfaceC1361l
    public final InterfaceC14991l billing() {
        return this.f1452l;
    }

    @Override // defpackage.InterfaceC1361l
    public final void cancel() {
        purchase(9);
    }

    public final void crashlytics(int i, IOException iOException) {
        if (amazon(i, iOException)) {
            this.f1453l.f16777l.isVip(this.f1454l, i);
        }
    }

    public final void firebase(int i) {
        synchronized (this) {
            try {
                if (mopub() == 0) {
                    this.f1458l = i;
                    notifyAll();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void isPro(C8309l c8309l, boolean z) {
        boolean zSubs;
        TimeZone timeZone = AbstractC11432l.yandex;
        synchronized (this) {
            try {
                if (this.f1451l && c8309l.amazon(":status") == null && c8309l.amazon(":method") == null) {
                    this.f1452l.getClass();
                } else {
                    this.f1451l = true;
                    this.f1460l.add(c8309l);
                }
                if (z) {
                    this.f1452l.f35153l = true;
                }
                zSubs = subs();
                notifyAll();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zSubs) {
            return;
        }
        this.f1453l.vip(this.f1454l);
    }

    public final void loadAd() throws IOException {
        C17573l c17573l = this.f1459l;
        if (c17573l.f34197l) {
            C18262l.metrica("stream closed");
            return;
        }
        if (c17573l.f34199l) {
            C18262l.metrica("stream finished");
        } else if (mopub() != 0) {
            IOException iOException = this.f1449l;
            if (iOException == null) {
                throw new C5333l(mopub());
            }
        }
    }

    public final int mopub() {
        int i;
        synchronized (this) {
            i = this.f1458l;
        }
        return i;
    }

    public final void purchase(int i) {
        if (amazon(i, null)) {
            this.f1453l.signatures(this.f1454l, i);
        }
    }

    public final boolean subs() {
        synchronized (this) {
            try {
                if (mopub() != 0) {
                    return false;
                }
                C17982l c17982l = this.f1452l;
                if (c17982l.f35153l || c17982l.f35155l) {
                    C17573l c17573l = this.f1459l;
                    if ((c17573l.f34199l || c17573l.f34197l) && this.f1451l) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC1361l
    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final InterfaceC10506l mo489throws() {
        return this.f1459l;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c  */
    public final void yandex() {
        boolean z;
        boolean zSubs;
        TimeZone timeZone = AbstractC11432l.yandex;
        synchronized (this) {
            try {
                C17982l c17982l = this.f1452l;
                if (c17982l.f35153l || !c17982l.f35155l) {
                    z = false;
                } else {
                    C17573l c17573l = this.f1459l;
                    if (c17573l.f34199l || c17573l.f34197l) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zSubs = subs();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            crashlytics(9, null);
        } else {
            if (zSubs) {
                return;
            }
            this.f1453l.vip(this.f1454l);
        }
    }
}
