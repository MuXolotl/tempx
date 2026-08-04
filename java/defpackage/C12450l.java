package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: lًّؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12450l {
    public static final C12450l yandex = new C12450l();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object yandex(long j, String str, byte[] bArr, AbstractC0283l abstractC0283l) {
        C6463l c6463l;
        Object c18435l;
        if (abstractC0283l instanceof C6463l) {
            c6463l = (C6463l) abstractC0283l;
            int i = c6463l.f13500l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c6463l.f13500l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c6463l = new C6463l(abstractC0283l);
            }
        } else {
            c6463l = new C6463l(abstractC0283l);
        }
        Object obj = c6463l.f13501l;
        int i2 = c6463l.f13500l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            if (!AbstractC8576l.yandex(str, "vk")) {
                return Boolean.FALSE;
            }
            try {
                C10705l c10705l = AbstractC14790l.crashlytics;
                c10705l.getClass();
                c18435l = (C4645l) c10705l.yandex(C4645l.Companion.serializer(), bArr);
            } catch (Throwable th) {
                c18435l = new C18435l(th);
            }
            C4645l c4645l = (C4645l) (c18435l instanceof C18435l ? null : c18435l);
            if (c4645l == null) {
                return Boolean.FALSE;
            }
            if (c4645l.yandex != j) {
                return Boolean.FALSE;
            }
            C7644l c7644lLoadAd = AbstractC16584l.loadAd();
            AbstractC2238l.isPro((C7026l) c7644lLoadAd.f15742l, c4645l);
            c7644lLoadAd.f15735l = c4645l;
            C7644l c7644lLoadAd2 = AbstractC16584l.loadAd();
            c6463l.f13500l = 1;
            Object objAdcel = c7644lLoadAd2.adcel(c6463l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objAdcel == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        AbstractC16584l.yandex().yandex();
        return Boolean.TRUE;
    }
}
