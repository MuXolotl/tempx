package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lِٖؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1080l implements InterfaceC16746l, InterfaceC6429l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final byte[] f2969l = new byte[0];

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f2970l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f2971l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f2972l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f2973l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f2974l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f2975l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f2976l;

    public C1080l(int i) {
        this.f2973l = i;
        switch (i) {
            case 6:
                this.f2970l = new C3384l[32];
                this.f2975l = new float[32];
                this.f2976l = new byte[32];
                C6295l c6295l = AbstractC13087l.yandex;
                this.f2974l = new C6295l();
                this.f2971l = new C6295l();
                break;
            default:
                this.f2970l = new C0869l();
                this.f2975l = new C0869l();
                this.f2974l = new C5530l();
                this.f2976l = f2969l;
                this.f2971l = AbstractC9968l.crashlytics(3, new C5146l(1));
                AbstractC9968l.crashlytics(3, new C10740l(27, this));
                break;
        }
    }

    @Override // defpackage.InterfaceC6429l
    public C8195l adcel(Object obj) {
        return AbstractC1757l.crashlytics(this, obj);
    }

    @Override // defpackage.InterfaceC6429l
    public int admob() {
        return this.f2972l;
    }

    @Override // defpackage.InterfaceC6429l
    public Object ads(NativePointer nativePointer, int i) {
        return AbstractC1757l.amazon(this, nativePointer, i);
    }

    public PorterDuff.Mode advert() {
        C1298l c1298l = (C1298l) this.f2976l;
        if (c1298l != null) {
            return (PorterDuff.Mode) c1298l.f3349l;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r10 < r3.f29844l) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void amazon(long r10, defpackage.C13143l r12) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f2974l
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            java.lang.Object r1 = r9.f2976l
            java.util.PriorityQueue r1 = (java.util.PriorityQueue) r1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 == 0) goto L9f
            int r3 = r9.f2972l
            if (r3 == 0) goto L9f
            r4 = -1
            if (r3 == r4) goto L2f
            int r3 = r1.size()
            int r5 = r9.f2972l
            if (r3 < r5) goto L2f
            java.lang.Object r3 = r1.peek()
            lّٔۢ r3 = (defpackage.C15255l) r3
            java.lang.String r5 = defpackage.AbstractC15323l.yandex
            long r5 = r3.f29844l
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 >= 0) goto L2f
            goto L9f
        L2f:
            java.lang.Object r3 = r9.f2975l
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L3f
            lْؗؖ r3 = new lْؗؖ
            r3.<init>()
            goto L45
        L3f:
            java.lang.Object r3 = r3.pop()
            lْؗؖ r3 = (defpackage.C13143l) r3
        L45:
            int r5 = r12.yandex()
            r3.m3563native(r5)
            byte[] r5 = r12.yandex
            int r12 = r12.loadAd
            byte[] r6 = r3.yandex
            int r7 = r3.yandex()
            r8 = 0
            java.lang.System.arraycopy(r5, r12, r6, r8, r7)
            java.lang.Object r12 = r9.f2971l
            lّٔۢ r12 = (defpackage.C15255l) r12
            if (r12 == 0) goto L6c
            long r5 = r12.f29844l
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 != 0) goto L6c
            java.util.ArrayList r9 = r12.f29845l
            r9.add(r3)
            return
        L6c:
            boolean r12 = r0.isEmpty()
            if (r12 == 0) goto L78
            lّٔۢ r12 = new lّٔۢ
            r12.<init>()
            goto L7e
        L78:
            java.lang.Object r12 = r0.pop()
            lّٔۢ r12 = (defpackage.C15255l) r12
        L7e:
            java.util.ArrayList r0 = r12.f29845l
            if (r2 == 0) goto L83
            r8 = 1
        L83:
            defpackage.AbstractC12442l.admob(r8)
            boolean r2 = r0.isEmpty()
            defpackage.AbstractC12442l.subscription(r2)
            r12.f29844l = r10
            r0.add(r3)
            r1.add(r12)
            r9.f2971l = r12
            int r10 = r9.f2972l
            if (r10 == r4) goto L9e
            r9.subs(r10)
        L9e:
            return
        L9f:
            java.lang.Object r9 = r9.f2970l
            lٕٟۜ r9 = (defpackage.InterfaceC15953l) r9
            r9.billing(r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1080l.amazon(long, lْؗؖ):void");
    }

    @Override // defpackage.InterfaceC6429l
    public C8195l appmetrica(Object obj, Object obj2, LinkedHashMap linkedHashMap) {
        return AbstractC1757l.billing(this, obj, obj2, linkedHashMap);
    }

    public void billing() {
        byte[] bArr = (byte[]) this.f2976l;
        byte[] bArr2 = f2969l;
        if (bArr == bArr2) {
            return;
        }
        ((C5530l) this.f2974l).close();
        ((C0869l) this.f2975l).skip(this.f2972l);
        ((C0869l) this.f2975l).mo736volatile((C0869l) this.f2970l);
        C0869l c0869l = (C0869l) this.f2970l;
        this.f2970l = (C0869l) this.f2975l;
        this.f2975l = c0869l;
        this.f2976l = bArr2;
        this.f2972l = 0;
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public void m786case(PorterDuff.Mode mode) {
        if (((C1298l) this.f2976l) == null) {
            this.f2976l = new C1298l();
        }
        C1298l c1298l = (C1298l) this.f2976l;
        c1298l.f3349l = mode;
        c1298l.f3348l = true;
        purchase();
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public void m787catch(Object obj) {
        this.f2971l = obj;
        RunnableC16789l runnableC16789l = new RunnableC16789l(this, 0, obj);
        C14500l c14500l = (C14500l) this.f2975l;
        if (c14500l.yandex.getLooper().getThread().isAlive()) {
            c14500l.amazon(runnableC16789l);
        }
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public void m788class(C3844l c3844l) {
        int iPurchase = c3844l.purchase();
        while (iPurchase != 0) {
            m800synchronized(1);
            int iMin = Math.min(this.f2972l, iPurchase);
            int i = this.f2972l - iMin;
            this.f2972l = i;
            iPurchase -= iMin;
            c3844l.amazon((byte[]) this.f2976l, iPurchase, i, iMin);
        }
    }

    @Override // defpackage.InterfaceC6429l
    public void clear() {
        AbstractC1757l.yandex(this);
    }

    @Override // defpackage.InterfaceC6429l
    public boolean containsKey(Object obj) {
        return AbstractC1757l.loadAd(this, obj);
    }

    @Override // defpackage.InterfaceC6429l
    public boolean containsValue(Object obj) {
        ((InterfaceC7832l) this.f2975l).mo1844l();
        C3585l c3585l = new C3585l(16);
        AbstractC14507l abstractC14507l = (AbstractC14507l) this.f2974l;
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) this.f2971l;
        realm_value_t realm_value_tVarCrashlytics = abstractC14507l.crashlytics(c3585l, obj);
        long[] jArr = new long[1];
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_dictionary_contains_value(ptr$cinterop_release, realm_value_tVarCrashlytics.yandex, realm_value_tVarCrashlytics, jArr);
        boolean z = jArr[0] != -1;
        c3585l.tapsense();
        return z;
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public void m789continue(Object obj) {
        Object obj2 = this.f2976l;
        this.f2976l = obj;
        if (obj2.equals(obj)) {
            return;
        }
        ((InterfaceC14342l) this.f2974l).yandex(obj2, obj);
    }

    @Override // defpackage.InterfaceC6429l
    public void crashlytics(int i) {
        this.f2972l = i;
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public void m790default(int i) {
        int i2;
        if ((i & (-128)) == 0) {
            i2 = 1;
        } else if ((i & (-16384)) == 0) {
            i2 = 2;
        } else if (((-2097152) & i) == 0) {
            i2 = 3;
        } else {
            i2 = ((-268435456) & i) == 0 ? 4 : 5;
        }
        m800synchronized(i2);
        int i3 = this.f2972l - i2;
        this.f2972l = i3;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = (byte[]) this.f2976l;
            if (i4 == 0) {
                bArr[i3] = (byte) i;
                return;
            } else {
                bArr[i3] = (byte) ((i & 127) | 128);
                i >>>= 7;
                i3++;
            }
        }
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public void m791else(ColorStateList colorStateList) {
        if (((C1298l) this.f2976l) == null) {
            this.f2976l = new C1298l();
        }
        C1298l c1298l = (C1298l) this.f2976l;
        c1298l.f3346l = colorStateList;
        c1298l.f3347l = true;
        purchase();
    }

    @Override // defpackage.InterfaceC6429l
    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public AbstractC14507l mo792extends() {
        return (AbstractC14507l) this.f2976l;
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public void m793final(long j) {
        int iBilling = AbstractC10547l.billing(j);
        m800synchronized(iBilling);
        int i = this.f2972l - iBilling;
        this.f2972l = i;
        while (true) {
            long j2 = (-128) & j;
            byte[] bArr = (byte[]) this.f2976l;
            if (j2 == 0) {
                bArr[i] = (byte) j;
                return;
            } else {
                bArr[i] = (byte) ((127 & j) | 128);
                j >>>= 7;
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public void m794for(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((C1298l) this.f2974l) == null) {
                this.f2974l = new C1298l();
            }
            C1298l c1298l = (C1298l) this.f2974l;
            c1298l.f3346l = colorStateList;
            c1298l.f3347l = true;
        } else {
            this.f2974l = null;
        }
        purchase();
    }

    @Override // defpackage.InterfaceC6429l
    public Object get(Object obj) {
        ((InterfaceC7832l) this.f2975l).mo1844l();
        C3585l c3585l = new C3585l(16);
        realm_value_t realm_value_tVarCrashlytics = ((AbstractC14507l) this.f2976l).crashlytics(c3585l, obj);
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) this.f2971l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_dictionary_find(ptr$cinterop_release, realm_value_tVarCrashlytics.yandex, realm_value_tVarCrashlytics, realm_value_tVar.yandex, realm_value_tVar, new boolean[1]);
        Object objAmazon = ((AbstractC14507l) this.f2974l).amazon(realm_value_tVar);
        c3585l.tapsense();
        return objAmazon;
    }

    @Override // defpackage.InterfaceC6429l
    public Object inmobi(NativePointer nativePointer, int i) {
        AbstractC14507l abstractC14507l = (AbstractC14507l) this.f2974l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i2 = AbstractC9795l.yandex;
        realmcJNI.realm_results_get(ptr$cinterop_release, i, realm_value_t.loadAd(realm_value_tVar), realm_value_tVar);
        return abstractC14507l.amazon(realm_value_tVar);
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public void m795interface(int i) {
        m800synchronized(4);
        int i2 = this.f2972l;
        int i3 = i2 - 4;
        this.f2972l = i3;
        byte[] bArr = (byte[]) this.f2976l;
        bArr[i3] = (byte) (i & 255);
        bArr[i2 - 3] = (byte) ((i >>> 8) & 255);
        bArr[i2 - 2] = (byte) ((i >>> 16) & 255);
        bArr[i2 - 1] = (byte) ((i >>> 24) & 255);
    }

    @Override // defpackage.InterfaceC6429l
    public C8195l isPro(Object obj, Object obj2, int i, Map map) {
        C3585l c3585l = new C3585l(16);
        realm_value_t realm_value_tVarCrashlytics = ((AbstractC14507l) this.f2976l).crashlytics(c3585l, obj);
        AbstractC14507l abstractC14507l = (AbstractC14507l) this.f2974l;
        realm_value_t realm_value_tVarCrashlytics2 = abstractC14507l.crashlytics(c3585l, obj2);
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) this.f2971l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i2 = AbstractC9795l.yandex;
        realmcJNI.realm_dictionary_find(ptr$cinterop_release, realm_value_tVarCrashlytics.yandex, realm_value_tVarCrashlytics, realm_value_tVar.yandex, realm_value_tVar, new boolean[1]);
        boolean[] zArr = new boolean[1];
        realmcJNI.realm_dictionary_insert(longPointerWrapper.getPtr$cinterop_release(), realm_value_tVarCrashlytics.yandex, realm_value_tVarCrashlytics, realm_value_tVarCrashlytics2.yandex, realm_value_tVarCrashlytics2, new long[1], zArr);
        C8195l c8195l = new C8195l(abstractC14507l.amazon(realm_value_tVar), Boolean.valueOf(zArr[0]));
        c3585l.tapsense();
        return c8195l;
    }

    public void isVip(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListSubs;
        View view = (View) this.f2970l;
        Context context = view.getContext();
        int[] iArr = AbstractC14657l.isVip;
        C12418l c12418lPro = C12418l.pro(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c12418lPro.f24518l;
        View view2 = (View) this.f2970l;
        AbstractC15872l.remoteconfig(view2, view2.getContext(), iArr, attributeSet, (TypedArray) c12418lPro.f24518l, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f2972l = typedArray.getResourceId(0, -1);
                C7862l c7862l = (C7862l) this.f2975l;
                Context context2 = view.getContext();
                int i2 = this.f2972l;
                synchronized (c7862l) {
                    colorStateListSubs = c7862l.yandex.subs(context2, i2);
                }
                if (colorStateListSubs != null) {
                    m794for(colorStateListSubs);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(c12418lPro.adcel(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(AbstractC2341l.crashlytics(typedArray.getInt(2, -1), null));
            }
            c12418lPro.advert();
        } catch (Throwable th) {
            c12418lPro.advert();
            throw th;
        }
    }

    public int license() {
        return (((byte[]) this.f2976l).length - this.f2972l) + ((int) ((C0869l) this.f2970l).f2526l);
    }

    @Override // defpackage.InterfaceC6429l
    public InterfaceC6429l loadAd(InterfaceC7832l interfaceC7832l, LongPointerWrapper longPointerWrapper) {
        return new C1080l((C5501l) this.f2970l, interfaceC7832l, (AbstractC14507l) this.f2974l, (AbstractC14507l) this.f2976l, longPointerWrapper);
    }

    @Override // defpackage.InterfaceC6429l
    public C8195l metrica(int i) {
        ((InterfaceC7832l) this.f2975l).mo1844l();
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) this.f2971l;
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_t realm_value_tVar2 = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        long j = i;
        int i2 = AbstractC9795l.yandex;
        realmcJNI.realm_dictionary_get(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar, realm_value_tVar2.yandex, realm_value_tVar2);
        return new C8195l(((AbstractC14507l) this.f2976l).amazon(realm_value_tVar), ((AbstractC14507l) this.f2974l).amazon(realm_value_tVar2));
    }

    @Override // defpackage.InterfaceC6429l
    public int mopub() {
        return AbstractC1757l.purchase(this);
    }

    @Override // defpackage.InterfaceC6429l
    /* JADX INFO: renamed from: native, reason: not valid java name */
    public void mo796native(InterfaceC2599l interfaceC2599l, int i, Map map) {
        AbstractC1757l.pro(this, interfaceC2599l, i, map);
    }

    public void premium(int i) {
        ColorStateList colorStateListSubs;
        this.f2972l = i;
        C7862l c7862l = (C7862l) this.f2975l;
        if (c7862l != null) {
            Context context = ((View) this.f2970l).getContext();
            synchronized (c7862l) {
                colorStateListSubs = c7862l.yandex.subs(context, i);
            }
        } else {
            colorStateListSubs = null;
        }
        m794for(colorStateListSubs);
        purchase();
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public void m797private(Runnable runnable) {
        C14500l c14500l = (C14500l) this.f2970l;
        if (c14500l.yandex.getLooper().getThread().isAlive()) {
            c14500l.amazon(runnable);
        }
    }

    public ColorStateList pro() {
        C1298l c1298l = (C1298l) this.f2976l;
        if (c1298l != null) {
            return (ColorStateList) c1298l.f3346l;
        }
        return null;
    }

    public void purchase() {
        View view = (View) this.f2970l;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((C1298l) this.f2974l) != null) {
                if (((C1298l) this.f2971l) == null) {
                    this.f2971l = new C1298l();
                }
                C1298l c1298l = (C1298l) this.f2971l;
                c1298l.f3346l = null;
                c1298l.f3347l = false;
                c1298l.f3349l = null;
                c1298l.f3348l = false;
                WeakHashMap weakHashMap = AbstractC15872l.yandex;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    c1298l.f3347l = true;
                    c1298l.f3346l = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    c1298l.f3348l = true;
                    c1298l.f3349l = backgroundTintMode;
                }
                if (c1298l.f3347l || c1298l.f3348l) {
                    C7862l.purchase(background, c1298l, view.getDrawableState());
                    return;
                }
            }
            C1298l c1298l2 = (C1298l) this.f2976l;
            if (c1298l2 != null) {
                C7862l.purchase(background, c1298l2, view.getDrawableState());
                return;
            }
            C1298l c1298l3 = (C1298l) this.f2974l;
            if (c1298l3 != null) {
                C7862l.purchase(background, c1298l3, view.getDrawableState());
            }
        }
    }

    @Override // defpackage.InterfaceC10984l
    public InterfaceC7832l remoteconfig() {
        return (InterfaceC7832l) this.f2975l;
    }

    @Override // defpackage.InterfaceC6429l
    public Object remove(Object obj) {
        return AbstractC1757l.ad(this, obj);
    }

    public void signatures() {
        this.f2972l = -1;
        m794for(null);
        purchase();
    }

    @Override // defpackage.InterfaceC6429l
    public C8195l smaato(Object obj) {
        C3585l c3585l = new C3585l(16);
        realm_value_t realm_value_tVarCrashlytics = ((AbstractC14507l) this.f2976l).crashlytics(c3585l, obj);
        AbstractC14507l abstractC14507l = (AbstractC14507l) this.f2974l;
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) this.f2971l;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        realmcJNI.realm_dictionary_find(ptr$cinterop_release, realm_value_tVarCrashlytics.yandex, realm_value_tVarCrashlytics, realm_value_tVar.yandex, realm_value_tVar, new boolean[1]);
        boolean[] zArr = new boolean[1];
        realmcJNI.realm_dictionary_erase(longPointerWrapper.getPtr$cinterop_release(), realm_value_tVarCrashlytics.yandex, realm_value_tVarCrashlytics, zArr);
        C8195l c8195l = new C8195l(abstractC14507l.amazon(realm_value_tVar), Boolean.valueOf(zArr[0]));
        c3585l.tapsense();
        return c8195l;
    }

    public C12551l startapp(int i) {
        int streamMaxVolume;
        ((AudioManager) this.f2976l).getClass();
        AudioManager audioManager = (AudioManager) this.f2976l;
        try {
            streamMaxVolume = audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            AbstractC6427l.metrica("AudioManagerCompat", "Could not retrieve stream volume for stream type " + i, e);
            streamMaxVolume = audioManager.getStreamMaxVolume(i);
        }
        return new C12551l(((AudioManager) this.f2976l).isStreamMute(i), i, streamMaxVolume, AbstractC13950l.m3825synchronized((AudioManager) this.f2976l, i), ((AudioManager) this.f2976l).getStreamMaxVolume(i));
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public void m798static(long j) {
        m800synchronized(8);
        int i = this.f2972l;
        int i2 = i - 8;
        this.f2972l = i2;
        byte[] bArr = (byte[]) this.f2976l;
        bArr[i2] = (byte) (j & 255);
        bArr[i - 7] = (byte) ((j >>> 8) & 255);
        bArr[i - 6] = (byte) ((j >>> 16) & 255);
        bArr[i - 5] = (byte) ((j >>> 24) & 255);
        bArr[i - 4] = (byte) ((j >>> 32) & 255);
        bArr[i - 3] = (byte) ((j >>> 40) & 255);
        bArr[i - 2] = (byte) ((j >>> 48) & 255);
        bArr[i - 1] = (byte) ((j >>> 56) & 255);
    }

    public void subs(int i) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.f2976l;
        while (priorityQueue.size() > i) {
            C15255l c15255l = (C15255l) priorityQueue.poll();
            String str = AbstractC15323l.yandex;
            int i2 = 0;
            while (true) {
                arrayList = c15255l.f29845l;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((InterfaceC15953l) this.f2970l).billing(c15255l.f29844l, (C13143l) arrayList.get(i2));
                ((ArrayDeque) this.f2975l).push((C13143l) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            C15255l c15255l2 = (C15255l) this.f2971l;
            if (c15255l2 != null && c15255l2.f29844l == c15255l.f29844l) {
                this.f2971l = null;
            }
            ((ArrayDeque) this.f2974l).push(c15255l);
        }
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public void m799switch(InterfaceC17302l interfaceC17302l, InterfaceC17302l interfaceC17302l2) {
        AbstractC12442l.subscription(Looper.myLooper() == ((C14500l) this.f2975l).yandex.getLooper());
        this.f2972l++;
        m797private(new RunnableC7762l(this, interfaceC17302l2, 11));
        m789continue(interfaceC17302l.apply(this.f2976l));
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public void m800synchronized(int i) {
        C5530l c5530l = (C5530l) this.f2974l;
        if (this.f2972l >= i) {
            return;
        }
        billing();
        C0869l c0869l = (C0869l) this.f2975l;
        byte[] bArr = loadAd.yandex;
        if (c5530l.f11801l == null) {
            c5530l.f11801l = c0869l;
            c5530l.f11800l = true;
        } else {
            C8339l.smaato("already attached to a buffer");
        }
        if (i <= 0) {
            C10754l.metrica(AbstractC0653l.vip(i, "minByteCount <= 0: "));
            return;
        }
        if (i > 8192) {
            C10754l.metrica(AbstractC0653l.vip(i, "minByteCount > Segment.SIZE: "));
            return;
        }
        C0869l c0869l2 = c5530l.f11801l;
        if (c0869l2 == null) {
            C8339l.smaato("not attached to a buffer");
            return;
        }
        if (!c5530l.f11800l) {
            C8339l.smaato("expandBuffer() only permitted for read/write buffers");
            return;
        }
        long j = c0869l2.f2526l;
        C18346l c18346lM730super = c0869l2.m730super(i);
        int i2 = 8192 - c18346lM730super.crashlytics;
        c18346lM730super.crashlytics = 8192;
        c0869l2.f2526l = ((long) i2) + j;
        byte[] bArr2 = c18346lM730super.yandex;
        if (j != 0 || 8192 != bArr2.length) {
            C8339l.smaato("Check failed.");
        } else {
            this.f2976l = bArr2;
            this.f2972l = 8192;
        }
    }

    public Object tapsense() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == ((C14500l) this.f2975l).yandex.getLooper()) {
            return this.f2976l;
        }
        AbstractC12442l.subscription(looperMyLooper == ((C14500l) this.f2970l).yandex.getLooper());
        return this.f2971l;
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public void m801throw(int i) {
        AbstractC12442l.subscription(i >= 0);
        this.f2972l = i;
        subs(i);
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public void m802throws(C3384l c3384l) {
        int iM2398catch = AbstractC8669l.m2398catch(c3384l, (C3384l[]) this.f2970l);
        if (iM2398catch >= 0) {
            C3384l[] c3384lArr = (C3384l[]) this.f2970l;
            int i = iM2398catch + 1;
            AbstractC8669l.pro(iM2398catch, i, this.f2972l, c3384lArr, c3384lArr);
            C3384l[] c3384lArr2 = (C3384l[]) this.f2970l;
            int i2 = this.f2972l;
            c3384lArr2[i2 - 1] = null;
            float[] fArr = (float[]) this.f2975l;
            System.arraycopy(fArr, i, fArr, iM2398catch, i2 - i);
            byte[] bArr = (byte[]) this.f2976l;
            AbstractC8669l.advert(bArr, iM2398catch, i, bArr, this.f2972l);
            this.f2972l--;
        }
    }

    public String toString() {
        String hostString;
        int port;
        String hostString2;
        switch (this.f2973l) {
            case 3:
                SocketAddress socketAddress = (SocketAddress) this.f2970l;
                StringBuilder sb = new StringBuilder("CIOConnectionPoint(uri=");
                sb.append((String) this.f2976l);
                sb.append(", method=");
                sb.append((C17721l) this.f2971l);
                sb.append(", version=");
                sb.append((String) this.f2974l);
                sb.append(", localAddress=");
                SocketAddress socketAddress2 = (SocketAddress) this.f2975l;
                String str = "";
                if (socketAddress2 != null) {
                    InetSocketAddress inetSocketAddress = socketAddress2 instanceof InetSocketAddress ? (InetSocketAddress) socketAddress2 : null;
                    if (inetSocketAddress == null || (hostString = inetSocketAddress.getHostString()) == null) {
                        hostString = "";
                    }
                } else {
                    hostString = "localhost";
                }
                sb.append(hostString);
                sb.append(", localPort=");
                int port2 = 0;
                if (socketAddress2 != null) {
                    InetSocketAddress inetSocketAddress2 = socketAddress2 instanceof InetSocketAddress ? (InetSocketAddress) socketAddress2 : null;
                    port = inetSocketAddress2 != null ? inetSocketAddress2.getPort() : 0;
                } else {
                    port = this.f2972l;
                }
                sb.append(port);
                sb.append(", remoteAddress=");
                if (socketAddress != null) {
                    InetSocketAddress inetSocketAddress3 = socketAddress instanceof InetSocketAddress ? (InetSocketAddress) socketAddress : null;
                    if (inetSocketAddress3 != null && (hostString2 = inetSocketAddress3.getHostString()) != null) {
                        str = hostString2;
                    }
                } else {
                    str = "unknown";
                }
                sb.append(str);
                sb.append(", remotePort=");
                if (socketAddress != null) {
                    InetSocketAddress inetSocketAddress4 = socketAddress instanceof InetSocketAddress ? (InetSocketAddress) socketAddress : null;
                    if (inetSocketAddress4 != null) {
                        port2 = inetSocketAddress4.getPort();
                    }
                }
                return AbstractC0653l.adcel(sb, port2, ')');
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC6429l
    public Object vip(Object obj, Object obj2, int i, Map map) {
        return AbstractC1757l.license(this, obj, obj2, i, map);
    }

    @Override // defpackage.InterfaceC6429l
    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public boolean mo803volatile(Object obj, Object obj2) {
        if (obj instanceof byte[]) {
            return Arrays.equals((byte[]) obj, obj2 != null ? (byte[]) obj2 : null);
        }
        return AbstractC8576l.yandex(obj, obj2);
    }

    @Override // defpackage.InterfaceC6429l
    public NativePointer yandex() {
        return (LongPointerWrapper) this.f2971l;
    }

    public C1080l(View view) {
        this.f2973l = 1;
        this.f2972l = -1;
        this.f2970l = view;
        this.f2975l = C7862l.yandex();
    }

    public C1080l(SocketAddress socketAddress, SocketAddress socketAddress2, String str, String str2, C17721l c17721l) {
        this.f2973l = 3;
        this.f2970l = socketAddress;
        this.f2975l = socketAddress2;
        this.f2974l = str;
        this.f2976l = str2;
        this.f2971l = c17721l;
        C17289l c17289l = C17289l.f33552l;
        String strAdmob = AbstractC7236l.admob("http");
        C17289l c17289l2 = (C17289l) C17289l.f33553l.get(strAdmob);
        this.f2972l = (c17289l2 == null ? new C17289l(strAdmob, 0) : c17289l2).f33555l;
    }

    public C1080l(InterfaceC15953l interfaceC15953l) {
        this.f2973l = 5;
        this.f2970l = interfaceC15953l;
        this.f2975l = new ArrayDeque();
        this.f2974l = new ArrayDeque();
        this.f2976l = new PriorityQueue();
        this.f2972l = -1;
    }

    public C1080l(Context context, SurfaceHolderCallbackC18330l surfaceHolderCallbackC18330l, int i, Looper looper, Looper looper2, C18527l c18527l) {
        this.f2973l = 7;
        this.f2970l = context.getApplicationContext();
        this.f2975l = surfaceHolderCallbackC18330l;
        C1080l c1080l = new C1080l(new C12551l(false, i, 0, 0, 0), looper, looper2, c18527l, new C4568l(5, this));
        this.f2974l = c1080l;
        c1080l.m797private(new RunnableC9534l(this, i, 13));
    }

    public C1080l(Object obj, Looper looper, Looper looper2, C18527l c18527l, InterfaceC14342l interfaceC14342l) {
        this.f2973l = 2;
        this.f2970l = c18527l.yandex(looper, null);
        this.f2975l = c18527l.yandex(looper2, null);
        this.f2976l = obj;
        this.f2971l = obj;
        this.f2974l = interfaceC14342l;
    }

    public C1080l(C5501l c5501l, InterfaceC7832l interfaceC7832l, AbstractC14507l abstractC14507l, AbstractC14507l abstractC14507l2, LongPointerWrapper longPointerWrapper) {
        this.f2973l = 4;
        this.f2970l = c5501l;
        this.f2975l = interfaceC7832l;
        this.f2974l = abstractC14507l;
        this.f2976l = abstractC14507l2;
        this.f2971l = longPointerWrapper;
    }
}
