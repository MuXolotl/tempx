package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Trace;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;

/* JADX INFO: renamed from: lِّ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17869l implements InterfaceC3587l {
    public static boolean admob = true;
    public final C13601l amazon = new C13601l();
    public boolean billing;
    public C17120l crashlytics;
    public final RenderScript loadAd;
    public final C11925l mopub;
    public C7504l purchase;
    public final C11183l yandex;

    public C17869l(C11183l c11183l) {
        this.yandex = c11183l;
        this.loadAd = RenderScript.create((Context) AbstractC13402l.loadAd(c11183l, AbstractC1242l.loadAd));
        this.mopub = ((InterfaceC3685l) AbstractC13402l.loadAd(c11183l, AbstractC4751l.mopub)).crashlytics();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fd A[Catch: all -> 0x0184, TRY_LEAVE, TryCatch #2 {all -> 0x0184, blocks: (B:43:0x00ef, B:48:0x00fd, B:71:0x0187, B:79:0x01b1, B:80:0x01b4), top: B:91:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0128  */
    /* JADX WARN: Code duplicated, block: B:71:0x0187 A[Catch: all -> 0x0184, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0184, blocks: (B:43:0x00ef, B:48:0x00fd, B:71:0x0187, B:79:0x01b1, B:80:0x01b4), top: B:91:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [lِٙؔ] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, lِٙؔ] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [lؚٜٞ, lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v3, types: [lؚؚۖ] */
    /* JADX WARN: Type inference failed for: r7v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [int] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public static final Object crashlytics(C17869l c17869l, C11925l c11925l, float f, AbstractC0283l abstractC0283l) throws Throwable {
        ?? c7415l;
        String str;
        int i;
        Unit unit;
        Object obj;
        C17120l c17120l;
        float f2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str2;
        ?? r1;
        String str3;
        C16552l c16552l;
        C4990l c4990l;
        C17120l c17120l2;
        int i7;
        ?? r7;
        ?? r6;
        ?? r2 = c11925l;
        C11183l c11183l = c17869l.yandex;
        if (abstractC0283l instanceof C7415l) {
            C7415l c7415l2 = (C7415l) abstractC0283l;
            int i8 = c7415l2.f15358l;
            if ((i8 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c7415l2.f15358l = i8 - RecyclerView.UNDEFINED_DURATION;
                c7415l = c7415l2;
            } else {
                c7415l = new C7415l(c17869l, abstractC0283l);
            }
        } else {
            c7415l = new C7415l(c17869l, abstractC0283l);
        }
        Object obj2 = c7415l.f15367l;
        int i9 = c7415l.f15358l;
        ?? r8 = 2;
        ?? r9 = 0;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            try {
                if (i9 != 0) {
                    try {
                        try {
                            if (i9 == 1) {
                                int i10 = c7415l.f15355l;
                                i3 = c7415l.f15363l;
                                int i11 = c7415l.f15366l;
                                i5 = c7415l.f15359l;
                                i6 = c7415l.f15364l;
                                f2 = c7415l.f15357l;
                                str = c7415l.f15356l;
                                c17120l = c7415l.f15365l;
                                String str4 = c7415l.f15361l;
                                C11925l c11925l2 = c7415l.f15362l;
                                try {
                                    AbstractC2829l.crashlytics(obj2);
                                    i2 = i10;
                                    r1 = c11925l2;
                                    str2 = str4;
                                    i4 = i11;
                                    try {
                                        Unit unit2 = Unit.INSTANCE;
                                        AbstractC15011l.amazon(0, str);
                                        if (!c11183l.f29462l) {
                                            r6 = str2;
                                            r7 = i4;
                                        } else {
                                            if (f2 > 0.0f) {
                                                AbstractC15011l.loadAd(0, "Haze-RenderScriptBlurEffect-updateSurface-applyBlur");
                                                try {
                                                    c16552l = AbstractC11463l.yandex;
                                                    c4990l = new C4990l(c17120l, f2, null);
                                                    c7415l.f15362l = null;
                                                    c7415l.f15361l = str2;
                                                    c7415l.f15365l = c17120l;
                                                    c7415l.f15356l = "Haze-RenderScriptBlurEffect-updateSurface-applyBlur";
                                                    c7415l.f15357l = f2;
                                                    c7415l.f15364l = i6;
                                                    c7415l.f15359l = i5;
                                                    c7415l.f15366l = i4 == true ? 1 : 0;
                                                    c7415l.f15363l = i3;
                                                    c7415l.f15355l = i2;
                                                    c7415l.f15358l = 2;
                                                    if (AbstractC10999l.firebase(c16552l, c4990l, c7415l) != enumC9342l) {
                                                        str3 = "Haze-RenderScriptBlurEffect-updateSurface-applyBlur";
                                                        c7415l = str2;
                                                        r2 = i4 == true ? 1 : 0;
                                                        c17120l2 = c17120l;
                                                    }
                                                    obj = unit;
                                                    obj = objSignature;
                                                    return enumC9342l;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    str3 = "Haze-RenderScriptBlurEffect-updateSurface-applyBlur";
                                                    boolean z = i4 == true ? 1 : 0;
                                                    i7 = 0;
                                                    AbstractC15011l.amazon(i7, str3);
                                                    throw th;
                                                }
                                            }
                                            c17869l.mopub.purchase(AbstractC5573l.metrica(c11183l).f7668l, (EnumC9931l) AbstractC13402l.loadAd(c11183l, AbstractC4751l.vip), r1.Signature, new C17330l(6, r1));
                                            r6 = str2;
                                            r7 = i4;
                                        }
                                        AbstractC15011l.amazon(r7, r6);
                                        return Unit.INSTANCE;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        i = 0;
                                        AbstractC15011l.amazon(i, str);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    i = 0;
                                    AbstractC15011l.amazon(i, str);
                                    throw th;
                                }
                            }
                            if (i9 != 2) {
                                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            int i12 = c7415l.f15366l;
                            str3 = c7415l.f15356l;
                            c17120l2 = c7415l.f15365l;
                            String str5 = c7415l.f15361l;
                            try {
                                AbstractC2829l.crashlytics(obj2);
                                r2 = i12;
                                c7415l = str5;
                            } catch (Throwable th4) {
                                th = th4;
                                i7 = 0;
                            }
                            Bitmap bitmap = (Bitmap) c17120l2.mopub;
                            c17869l.mopub.purchase(AbstractC5573l.metrica(c11183l).f7668l, (EnumC9931l) AbstractC13402l.loadAd(c11183l, AbstractC4751l.vip), (((long) bitmap.getWidth()) << 32) | (((long) bitmap.getHeight()) & 4294967295L), new C17330l(5, bitmap));
                            Trace.endSection();
                            r7 = r2;
                            r6 = c7415l;
                            AbstractC15011l.amazon(r7, r6);
                            return Unit.INSTANCE;
                        } catch (Throwable th5) {
                            Trace.endSection();
                            throw th5;
                        }
                        Unit unit3 = Unit.INSTANCE;
                        AbstractC15011l.amazon(0, str3);
                        Trace.beginSection("Haze-RenderScriptBlurEffect-updateSurface-drawToContentLayer");
                    } catch (Throwable th6) {
                        th = th6;
                        i7 = 0;
                        AbstractC15011l.amazon(i7, str3);
                        throw th;
                    }
                } else {
                    AbstractC2829l.crashlytics(obj2);
                    String str6 = "Haze-RenderScriptBlurEffect-updateSurface";
                    AbstractC15011l.loadAd(0, "Haze-RenderScriptBlurEffect-updateSurface");
                    try {
                        long j = r2.Signature;
                        try {
                            C17120l c17120l3 = c17869l.crashlytics;
                            if (c17120l3 == null || !C4999l.loadAd(c17120l3.yandex, j)) {
                                if (c17120l3 != null) {
                                    c17120l3.loadAd = true;
                                    ((ScriptIntrinsicBlur) c17120l3.amazon).destroy();
                                    ((Allocation) c17120l3.purchase).destroy();
                                    ((Allocation) c17120l3.billing).destroy();
                                    ((RenderScript) c17120l3.crashlytics).destroy();
                                }
                                c17120l3 = new C17120l(c17869l.loadAd, j);
                                c17869l.crashlytics = c17120l3;
                            }
                            str = "Haze-RenderScriptBlurEffect-updateSurface-drawLayerToSurface";
                            AbstractC15011l.loadAd(0, "Haze-RenderScriptBlurEffect-updateSurface-drawLayerToSurface");
                            try {
                                AbstractC6427l.yandex(((Allocation) c17120l3.purchase).getSurface(), r2, AbstractC5573l.metrica(c11183l).f7668l, c17869l.amazon);
                                c7415l.f15362l = r2;
                                c7415l.f15361l = "Haze-RenderScriptBlurEffect-updateSurface";
                                c7415l.f15365l = c17120l3;
                                c7415l.f15356l = "Haze-RenderScriptBlurEffect-updateSurface-drawLayerToSurface";
                                c7415l.f15357l = f;
                                c7415l.f15364l = 0;
                                c7415l.f15359l = 0;
                                c7415l.f15366l = 0;
                                c7415l.f15363l = 0;
                                c7415l.f15355l = 0;
                                c7415l.f15358l = 1;
                                Object objSignature = ((C7119l) c17120l3.admob).Signature(c7415l);
                                if (objSignature != enumC9342l) {
                                    unit = Unit.INSTANCE;
                                }
                                if (obj != enumC9342l) {
                                    obj = unit;
                                    obj = objSignature;
                                    c17120l = c17120l3;
                                    f2 = f;
                                    i2 = 0;
                                    i3 = 0;
                                    i4 = 0;
                                    i5 = 0;
                                    i6 = 0;
                                    r1 = r2;
                                    str2 = str6;
                                    Unit unit4 = Unit.INSTANCE;
                                    AbstractC15011l.amazon(0, str);
                                    if (!c11183l.f29462l) {
                                        r6 = str2;
                                        r7 = i4;
                                    } else if (f2 > 0.0f) {
                                        AbstractC15011l.loadAd(0, "Haze-RenderScriptBlurEffect-updateSurface-applyBlur");
                                        c16552l = AbstractC11463l.yandex;
                                        c4990l = new C4990l(c17120l, f2, null);
                                        c7415l.f15362l = null;
                                        c7415l.f15361l = str2;
                                        c7415l.f15365l = c17120l;
                                        c7415l.f15356l = "Haze-RenderScriptBlurEffect-updateSurface-applyBlur";
                                        c7415l.f15357l = f2;
                                        c7415l.f15364l = i6;
                                        c7415l.f15359l = i5;
                                        c7415l.f15366l = i4 == true ? 1 : 0;
                                        c7415l.f15363l = i3;
                                        c7415l.f15355l = i2;
                                        c7415l.f15358l = 2;
                                        if (AbstractC10999l.firebase(c16552l, c4990l, c7415l) != enumC9342l) {
                                            str3 = "Haze-RenderScriptBlurEffect-updateSurface-applyBlur";
                                            c7415l = str2;
                                            r2 = i4 == true ? 1 : 0;
                                            c17120l2 = c17120l;
                                            Unit unit5 = Unit.INSTANCE;
                                            AbstractC15011l.amazon(0, str3);
                                            Trace.beginSection("Haze-RenderScriptBlurEffect-updateSurface-drawToContentLayer");
                                            Bitmap bitmap2 = (Bitmap) c17120l2.mopub;
                                            c17869l.mopub.purchase(AbstractC5573l.metrica(c11183l).f7668l, (EnumC9931l) AbstractC13402l.loadAd(c11183l, AbstractC4751l.vip), (((long) bitmap2.getWidth()) << 32) | (((long) bitmap2.getHeight()) & 4294967295L), new C17330l(5, bitmap2));
                                            Trace.endSection();
                                            r7 = r2;
                                            r6 = c7415l;
                                        }
                                    } else {
                                        c17869l.mopub.purchase(AbstractC5573l.metrica(c11183l).f7668l, (EnumC9931l) AbstractC13402l.loadAd(c11183l, AbstractC4751l.vip), r1.Signature, new C17330l(6, r1));
                                        r6 = str2;
                                        r7 = i4;
                                    }
                                    AbstractC15011l.amazon(r7, r6);
                                    return Unit.INSTANCE;
                                }
                                obj = unit;
                                obj = objSignature;
                                return enumC9342l;
                            } catch (Throwable th7) {
                                th = th7;
                                i = 0;
                                AbstractC15011l.amazon(i, str);
                                throw th;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            r9 = 0;
                            r8 = str6;
                            AbstractC15011l.amazon(r9, r8);
                            throw th;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        r8 = str6;
                    }
                }
                AbstractC15011l.amazon(i7, str3);
                throw th;
            } catch (Throwable th10) {
                th = th10;
                r9 = r2;
                r8 = c7415l;
                AbstractC15011l.amazon(r9, r8);
                throw th;
            }
        } catch (Throwable th11) {
            th = th11;
            r9 = 1;
        }
    }

    @Override // defpackage.InterfaceC3587l
    public final void loadAd() {
        C7504l c7504l = this.purchase;
        if (c7504l != null) {
            c7504l.ads(null);
        }
        ((InterfaceC3685l) AbstractC13402l.loadAd(this.yandex, AbstractC4751l.mopub)).yandex(this.mopub);
        C17120l c17120l = this.crashlytics;
        if (c17120l != null) {
            c17120l.loadAd = true;
            ((ScriptIntrinsicBlur) c17120l.amazon).destroy();
            ((Allocation) c17120l.purchase).destroy();
            ((Allocation) c17120l.billing).destroy();
            ((RenderScript) c17120l.crashlytics).destroy();
        }
    }

    @Override // defpackage.InterfaceC3587l
    public final void yandex(C6742l c6742l) {
        C11183l c11183l;
        C7504l c7504l;
        C17869l c17869l = this;
        C10707l c10707l = AbstractC1242l.loadAd;
        C11183l c11183l2 = c17869l.yandex;
        Context context = (Context) AbstractC13402l.loadAd(c11183l2, c10707l);
        long j = c11183l2.f22492l;
        C13250l c13250l = new C13250l();
        float fYandex = AbstractC13958l.yandex(c11183l2);
        c13250l.f26029l = fYandex;
        C13250l c13250l2 = new C13250l();
        c6742l.loadAd();
        float fMo868instanceof = c6742l.mo868instanceof(AbstractC13958l.amazon(c11183l2)) * fYandex;
        c13250l2.f26029l = fMo868instanceof;
        if (fMo868instanceof > 25.0f) {
            c13250l.f26029l = (25.0f / fMo868instanceof) * c13250l.f26029l;
            c13250l2.f26029l = 25.0f;
        }
        C11925l c11925l = c17869l.mopub;
        if (C4999l.loadAd(c11925l.Signature, 0L) || (c7504l = c17869l.purchase) == null || !c7504l.mopub()) {
            c17869l.billing = false;
            C11925l c11925lLoadAd = AbstractC13359l.loadAd(c6742l, c11183l2, c13250l.f26029l, c11183l2.f22479l, j);
            c11183l = c11183l2;
            if (c11925lLoadAd != null) {
                c11925lLoadAd.mopub(c11183l.f22480l != null);
                InterfaceC14029l interfaceC14029l = null;
                if (C4999l.loadAd(c11925l.Signature, 0L)) {
                    AbstractC10999l.admob(new C1086l(c17869l, c11925lLoadAd, c13250l2, interfaceC14029l, 0));
                    c17869l = this;
                } else {
                    InterfaceC2262l interfaceC2262lM3914l = c11183l.m3914l();
                    C16552l c16552l = AbstractC11463l.yandex;
                    c17869l = this;
                    c17869l.purchase = AbstractC10999l.mopub(interfaceC2262lM3914l, AbstractC17278l.yandex.f6462l, 0, new C1086l(c17869l, c11925lLoadAd, c13250l2, interfaceC14029l, 1), 2);
                }
            }
        } else {
            c17869l.billing = true;
            c11183l = c11183l2;
        }
        AbstractC3586l.mopub(c11183l, new C17016l(c17869l, c6742l, j, c13250l, context));
    }
}
