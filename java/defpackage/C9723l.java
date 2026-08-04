package defpackage;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lٍٞۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9723l implements InterfaceC12679l, InterfaceC18108l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final ArrayList f19824l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f19825l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public InterfaceC5755l f19826l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Executor f19827l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C16815l f19828l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f19829l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final LongSparseArray f19830l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f19831l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C6536l f19832l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final ArrayList f19833l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final LongSparseArray f19834l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C8634l f19835l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f19836l;

    public C9723l(int i, int i2, int i3, int i4) {
        C8634l c8634l = new C8634l(ImageReader.newInstance(i, i2, i3, i4));
        this.f19829l = new Object();
        this.f19828l = new C16815l(this);
        this.f19825l = 0;
        this.f19832l = new C6536l(22, this);
        this.f19831l = false;
        this.f19834l = new LongSparseArray();
        this.f19830l = new LongSparseArray();
        this.f19824l = new ArrayList();
        this.f19835l = c8634l;
        this.f19836l = 0;
        this.f19833l = new ArrayList(mo1997strictfp());
    }

    public final void admob() {
        synchronized (this.f19829l) {
            try {
                if (this.f19830l.size() != 0 && this.f19834l.size() != 0) {
                    long jKeyAt = this.f19830l.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.f19834l.keyAt(0);
                    AbstractC5641l.yandex(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.f19830l.size() - 1; size >= 0; size--) {
                            if (this.f19830l.keyAt(size) < jKeyAt2) {
                                ((InterfaceC11792l) this.f19830l.valueAt(size)).close();
                                this.f19830l.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f19834l.size() - 1; size2 >= 0; size2--) {
                            if (this.f19834l.keyAt(size2) < jKeyAt) {
                                this.f19834l.removeAt(size2);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void amazon(C15607l c15607l) {
        InterfaceC5755l interfaceC5755l;
        Executor executor;
        synchronized (this.f19829l) {
            try {
                if (this.f19833l.size() < mo1997strictfp()) {
                    c15607l.yandex(this);
                    this.f19833l.add(c15607l);
                    interfaceC5755l = this.f19826l;
                    executor = this.f19827l;
                } else {
                    AbstractC5088l.yandex("TAG", "Maximum image number reached.");
                    c15607l.close();
                    interfaceC5755l = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC5755l != null) {
            if (executor != null) {
                executor.execute(new RunnableC12388l(this, interfaceC5755l, 27));
            } else {
                interfaceC5755l.subs(this);
            }
        }
    }

    public final void billing(InterfaceC12679l interfaceC12679l) {
        InterfaceC11792l interfaceC11792lMo1996native;
        synchronized (this.f19829l) {
            try {
                if (this.f19831l) {
                    return;
                }
                int size = this.f19830l.size() + this.f19833l.size();
                if (size >= interfaceC12679l.mo1997strictfp()) {
                    AbstractC5088l.yandex("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        interfaceC11792lMo1996native = interfaceC12679l.mo1996native();
                        if (interfaceC11792lMo1996native != null) {
                            this.f19825l--;
                            size++;
                            this.f19830l.put(interfaceC11792lMo1996native.mo1829const().crashlytics(), interfaceC11792lMo1996native);
                            mopub();
                        }
                    } catch (IllegalStateException e) {
                        AbstractC5088l.loadAd("MetadataImageReader", "Failed to acquire next image.", e);
                        interfaceC11792lMo1996native = null;
                    }
                    if (interfaceC11792lMo1996native == null || this.f19825l <= 0) {
                        break;
                    }
                } while (size < interfaceC12679l.mo1997strictfp());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC12679l
    public final void close() {
        synchronized (this.f19829l) {
            try {
                if (this.f19831l) {
                    return;
                }
                Iterator it = new ArrayList(this.f19833l).iterator();
                while (it.hasNext()) {
                    ((InterfaceC11792l) it.next()).close();
                }
                this.f19833l.clear();
                this.f19835l.close();
                this.f19831l = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void crashlytics(AbstractC12655l abstractC12655l) {
        synchronized (this.f19829l) {
            try {
                int iIndexOf = this.f19833l.indexOf(abstractC12655l);
                if (iIndexOf >= 0) {
                    this.f19833l.remove(iIndexOf);
                    int i = this.f19836l;
                    if (iIndexOf <= i) {
                        this.f19836l = i - 1;
                    }
                }
                this.f19824l.remove(abstractC12655l);
                if (this.f19825l > 0) {
                    billing(this.f19835l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC12679l
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f19829l) {
            surface = this.f19835l.getSurface();
        }
        return surface;
    }

    @Override // defpackage.InterfaceC12679l
    public final int loadAd() {
        int iLoadAd;
        synchronized (this.f19829l) {
            iLoadAd = this.f19835l.loadAd();
        }
        return iLoadAd;
    }

    @Override // defpackage.InterfaceC12679l
    public final int metrica() {
        int iMetrica;
        synchronized (this.f19829l) {
            iMetrica = this.f19835l.metrica();
        }
        return iMetrica;
    }

    public final void mopub() {
        synchronized (this.f19829l) {
            try {
                for (int size = this.f19834l.size() - 1; size >= 0; size--) {
                    InterfaceC11699l interfaceC11699l = (InterfaceC11699l) this.f19834l.valueAt(size);
                    long jCrashlytics = interfaceC11699l.crashlytics();
                    InterfaceC11792l interfaceC11792l = (InterfaceC11792l) this.f19830l.get(jCrashlytics);
                    if (interfaceC11792l != null) {
                        this.f19830l.remove(jCrashlytics);
                        this.f19834l.removeAt(size);
                        amazon(new C15607l(interfaceC11792l, null, interfaceC11699l));
                    }
                }
                admob();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC12679l
    /* JADX INFO: renamed from: native */
    public final InterfaceC11792l mo1996native() {
        synchronized (this.f19829l) {
            try {
                if (this.f19833l.isEmpty()) {
                    return null;
                }
                if (this.f19836l >= this.f19833l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = this.f19833l;
                int i = this.f19836l;
                this.f19836l = i + 1;
                InterfaceC11792l interfaceC11792l = (InterfaceC11792l) arrayList.get(i);
                this.f19824l.add(interfaceC11792l);
                return interfaceC11792l;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC12679l
    public final void premium(InterfaceC5755l interfaceC5755l, Executor executor) {
        synchronized (this.f19829l) {
            interfaceC5755l.getClass();
            this.f19826l = interfaceC5755l;
            executor.getClass();
            this.f19827l = executor;
            this.f19835l.premium(this.f19832l, executor);
        }
    }

    @Override // defpackage.InterfaceC12679l
    public final int purchase() {
        int iPurchase;
        synchronized (this.f19829l) {
            iPurchase = this.f19835l.purchase();
        }
        return iPurchase;
    }

    @Override // defpackage.InterfaceC12679l
    public final InterfaceC11792l smaato() {
        synchronized (this.f19829l) {
            try {
                if (this.f19833l.isEmpty()) {
                    return null;
                }
                if (this.f19836l >= this.f19833l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.f19833l.size() - 1; i++) {
                    if (!this.f19824l.contains(this.f19833l.get(i))) {
                        arrayList.add((InterfaceC11792l) this.f19833l.get(i));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC11792l) it.next()).close();
                }
                int size = this.f19833l.size();
                ArrayList arrayList2 = this.f19833l;
                this.f19836l = size;
                InterfaceC11792l interfaceC11792l = (InterfaceC11792l) arrayList2.get(size - 1);
                this.f19824l.add(interfaceC11792l);
                return interfaceC11792l;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC12679l
    public final void startapp() {
        synchronized (this.f19829l) {
            this.f19835l.startapp();
            this.f19826l = null;
            this.f19827l = null;
            this.f19825l = 0;
        }
    }

    @Override // defpackage.InterfaceC12679l
    /* JADX INFO: renamed from: strictfp */
    public final int mo1997strictfp() {
        int iMo1997strictfp;
        synchronized (this.f19829l) {
            iMo1997strictfp = this.f19835l.mo1997strictfp();
        }
        return iMo1997strictfp;
    }

    @Override // defpackage.InterfaceC18108l
    public final void yandex(AbstractC12655l abstractC12655l) {
        synchronized (this.f19829l) {
            crashlytics(abstractC12655l);
        }
    }
}
