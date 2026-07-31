package defpackage;

import android.content.Context;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٕۦ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16076l implements InterfaceC2262l {

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public static C0554l f31498l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public C16811l f31499l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final C4626l f31500l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC17205l f31501l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C11610l f31502l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C3316l f31503l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public boolean f31504l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C12220l f31505l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final C11485l f31506l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C4910l f31507l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Context f31508l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C18662l f31509l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final ArrayList f31510l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C4816l f31511l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final File f31512l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C3342l f31513l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C5760l f31514l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C7390l f31515l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final InterfaceC1246l f31516l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C11324l f31517l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C5406l f31518l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C18073l f31519l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final C1424l f31520l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C2258l f31521l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C8688l f31522l;

    public C16076l(Context context, InterfaceC17205l interfaceC17205l, C7390l c7390l, C11610l c11610l, C12220l c12220l, C11324l c11324l, File file, C18073l c18073l, InterfaceC1246l interfaceC1246l, C1424l c1424l, C3342l c3342l) {
        C4626l c4626l = C4626l.yandex;
        C11485l c11485l = C11485l.f23072l;
        this.f31509l = AbstractC11990l.loadAd();
        this.f31508l = context;
        this.f31501l = interfaceC17205l;
        this.f31515l = c7390l;
        this.f31514l = C5760l.yandex;
        this.f31518l = C5406l.yandex;
        this.f31502l = c11610l;
        this.f31505l = c12220l;
        this.f31517l = c11324l;
        this.f31512l = file;
        this.f31519l = c18073l;
        this.f31516l = interfaceC1246l;
        this.f31500l = c4626l;
        this.f31520l = c1424l;
        this.f31513l = c3342l;
        this.f31506l = c11485l;
        C4816l c4816l = new C4816l(0);
        this.f31511l = c4816l;
        this.f31521l = new C2258l(this, c4816l, new C18606l(this, 7));
        this.f31510l = new ArrayList();
        this.f31504l = true;
        this.f31503l = new C3316l(16, this);
        this.f31522l = new C8688l(new C18606l(this, 8));
        this.f31507l = AbstractC8618l.yandex();
    }

    public final Object admob(Function0 function0) {
        if (AbstractC8576l.yandex(Looper.myLooper(), Looper.getMainLooper())) {
            return function0.invoke();
        }
        AbstractC2991l.billing(AbstractC17265l.yandex(this), 6, "Some code is calling PlaybackControllerImpl on a non-main thread. Please fix this!", null);
        new Throwable().fillInStackTrace().printStackTrace();
        C16552l c16552l = AbstractC11463l.yandex;
        return AbstractC10999l.subs(AbstractC17278l.yandex, new C14019l(function0, null, 8));
    }

    public final void ads() {
        subs(new C2051l(2, null, 9));
    }

    public final boolean amazon() {
        return this.f31521l.billing.firebase();
    }

    public final C10507l crashlytics() {
        return (C10507l) admob(new C18606l(this, 11));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005d A[PHI: r1 r5 r6 r7 r8 r12
  0x005d: PHI (r1v15 int) = (r1v13 int), (r1v17 int) binds: [B:76:0x01e7, B:15:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x005d: PHI (r5v8 lۡۨ) = (r5v6 lۡۨ), (r5v12 lۡۨ) binds: [B:76:0x01e7, B:15:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x005d: PHI (r6v9 lٖۨۦ) = (r6v7 lٖۨۦ), (r6v13 lٖۨۦ) binds: [B:76:0x01e7, B:15:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x005d: PHI (r7v11 lِْٙ) = (r7v9 lِْٙ), (r7v12 lِْٙ) binds: [B:76:0x01e7, B:15:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x005d: PHI (r8v21 lٍ٘ۢ) = (r8v19 lٍ٘ۢ), (r8v23 lٍ٘ۢ) binds: [B:76:0x01e7, B:15:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x005d: PHI (r12v21 java.util.Map) = (r12v19 java.util.Map), (r12v23 java.util.Map) binds: [B:76:0x01e7, B:15:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:42:0x0103  */
    /* JADX WARN: Code duplicated, block: B:49:0x0117  */
    /* JADX WARN: Code duplicated, block: B:52:0x0122  */
    /* JADX WARN: Code duplicated, block: B:54:0x013b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0143  */
    /* JADX WARN: Code duplicated, block: B:59:0x0164  */
    /* JADX WARN: Code duplicated, block: B:61:0x0167  */
    /* JADX WARN: Code duplicated, block: B:64:0x0180  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ac A[PHI: r1 r5 r6 r7 r8 r12
  0x01ac: PHI (r1v13 int) = (r1v11 int), (r1v14 int) binds: [B:69:0x01a8, B:17:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x01ac: PHI (r5v6 lۡۨ) = (r5v4 lۡۨ), (r5v7 lۡۨ) binds: [B:69:0x01a8, B:17:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x01ac: PHI (r6v7 lٖۨۦ) = (r6v5 lٖۨۦ), (r6v8 lٖۨۦ) binds: [B:69:0x01a8, B:17:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x01ac: PHI (r7v9 lِْٙ) = (r7v7 lِْٙ), (r7v10 lِْٙ) binds: [B:69:0x01a8, B:17:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x01ac: PHI (r8v19 lٍ٘ۢ) = (r8v17 lٍ٘ۢ), (r8v20 lٍ٘ۢ) binds: [B:69:0x01a8, B:17:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x01ac: PHI (r12v19 java.util.Map) = (r12v17 java.util.Map), (r12v20 java.util.Map) binds: [B:69:0x01a8, B:17:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x01c6 A[LOOP:0: B:72:0x01c0->B:74:0x01c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x020f  */
    /* JADX WARN: Code duplicated, block: B:87:0x023d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:92:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0237, code lost:
    
        if (defpackage.AbstractC10999l.firebase(r8, r0, r9) == r10) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object firebase(java.util.Map r18, java.util.List r19, defpackage.InterfaceC17817l r20, defpackage.C13305l r21, defpackage.AbstractC0283l r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16076l.firebase(java.util.Map, java.util.List, lٍ٘ۢ, lِْٙ, lّؑۧ):java.lang.Object");
    }

    public final void isPro() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object loadAd(AbstractC0283l abstractC0283l) throws Throwable {
        C2284l c2284l;
        if (abstractC0283l instanceof C2284l) {
            c2284l = (C2284l) abstractC0283l;
            int i = c2284l.f4980l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2284l.f4980l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c2284l = new C2284l(this, abstractC0283l);
            }
        } else {
            c2284l = new C2284l(this, abstractC0283l);
        }
        Object objFirebase = c2284l.f4979l;
        int i2 = c2284l.f4980l;
        InterfaceC14029l interfaceC14029l = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objFirebase);
            C16811l c16811l = this.f31499l;
            if (c16811l != null) {
                return c16811l;
            }
            C16552l c16552l = AbstractC11463l.yandex;
            C2975l c2975l = AbstractC17278l.yandex;
            C11226l c11226l = new C11226l(this, interfaceC14029l, 0);
            c2284l.f4980l = 1;
            objFirebase = AbstractC10999l.firebase(c2975l, c11226l, c2284l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objFirebase == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objFirebase);
        }
        return (C16811l) objFirebase;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0057 A[PHI: r7 r8 r9
  0x0057: PHI (r7v6 int) = (r7v4 int), (r7v8 int) binds: [B:31:0x00bc, B:16:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x0057: PHI (r8v9 lۡۨ) = (r8v7 lۡۨ), (r8v17 lۡۨ) binds: [B:31:0x00bc, B:16:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x0057: PHI (r9v6 lٍ٘ۢ) = (r9v4 lٍ٘ۢ), (r9v12 lٍ٘ۢ) binds: [B:31:0x00bc, B:16:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x009d  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:42:0x0105 A[LOOP:0: B:40:0x00ff->B:42:0x0105, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x0127 A[PHI: r7 r8 r9
  0x0127: PHI (r7v11 int) = (r7v9 int), (r7v14 int) binds: [B:44:0x0124, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]
  0x0127: PHI (r8v20 int) = (r8v18 int), (r8v22 int) binds: [B:44:0x0124, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]
  0x0127: PHI (r9v15 lۡۨ) = (r9v13 lۡۨ), (r9v18 lۡۨ) binds: [B:44:0x0124, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0147, code lost:
    
        if (r6.billing(r9, 0, defpackage.EnumC8098l.f16879l, r11) == r5) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object metrica(defpackage.InterfaceC17817l r7, defpackage.C12759l r8, int r9, defpackage.AbstractC18643l r10, defpackage.AbstractC0283l r11) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16076l.metrica(lٍ٘ۢ, lّٟٞ, int, lۡۨ, lّؑۧ):java.lang.Object");
    }

    public final boolean mopub() {
        C16811l c16811l = this.f31499l;
        if (!(c16811l != null ? c16811l.f32834l.mo319l() : false)) {
            return true;
        }
        C2258l c2258l = this.f31521l;
        return c2258l.mopub.subs() || c2258l.subs.isPro();
    }

    public final EnumC11447l purchase() {
        return (EnumC11447l) admob(new C18606l(this, 3));
    }

    public final void remoteconfig(boolean z) {
        subs(new C5302l(this, z, null));
    }

    public final void smaato() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object startapp(AbstractC0283l abstractC0283l) throws Throwable {
        C6622l c6622l;
        if (abstractC0283l instanceof C6622l) {
            c6622l = (C6622l) abstractC0283l;
            int i = c6622l.f13861l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c6622l.f13861l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c6622l = new C6622l(this, abstractC0283l);
            }
        } else {
            c6622l = new C6622l(this, abstractC0283l);
        }
        Object objLoadAd = c6622l.f13860l;
        int i2 = c6622l.f13861l;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objLoadAd);
            c6622l.f13861l = 1;
            objLoadAd = loadAd(c6622l);
            Object obj = EnumC9342l.f19165l;
            if (objLoadAd == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objLoadAd);
        }
        C16811l c16811l = (C16811l) objLoadAd;
        int i4 = 2;
        if (((Boolean) AbstractC8619l.yandex.yandex()).booleanValue()) {
            int iOrdinal = ((EnumC12501l) AbstractC8619l.crashlytics.yandex()).ordinal();
            if (iOrdinal == 0) {
                i3 = 0;
            } else if (iOrdinal == 1) {
                i3 = 2;
            } else if (iOrdinal != 2) {
                C18725l.billing();
                return null;
            }
            i4 = i3;
        }
        c16811l.mo2752const(i4);
        return Unit.INSTANCE;
    }

    public final C7504l subs(Function2 function2) {
        return AbstractC10999l.mopub(this, null, 0, new C17949l(function2, this, null, 8), 3);
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f31509l.f36440l;
    }

    public final void yandex(List list, boolean z) {
        if (list.isEmpty()) {
            return;
        }
        subs(new C18523l(this, list, z, (InterfaceC14029l) null));
    }
}
