package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُۦٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11491l extends C2998l implements Function2 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f23104l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11491l(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.f23104l = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f23104l;
        Object obj3 = this.f6501l;
        switch (i) {
            case 0:
                ((C15578l) obj3).yandex((C6956l) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            case 1:
                float fFloatValue = ((Number) obj).floatValue();
                C7473l c7473l = (C7473l) obj3;
                boolean zLoadAd = c7473l.loadAd();
                C13765l c13765l = c7473l.billing;
                float f = 0.0f;
                if (!zLoadAd) {
                    if (c7473l.yandex() > c7473l.mopub.admob()) {
                        ((Function0) c7473l.loadAd.getValue()).invoke();
                    }
                    AbstractC10999l.mopub(c7473l.yandex, null, 0, new C18716l(c7473l, 0.0f, null), 3);
                    if (c13765l.admob() == 0.0f || fFloatValue < 0.0f) {
                        fFloatValue = 0.0f;
                    }
                    c13765l.subs(0.0f);
                    f = fFloatValue;
                }
                return new Float(f);
            case 2:
                C9649l c9649l = (C9649l) obj3;
                AbstractC10999l.mopub(c9649l.f19681l.crashlytics(), null, 0, new C3652l(c9649l, ((C12121l) obj).yandex, null, 2), 3);
                return Unit.INSTANCE;
            default:
                C9649l c9649l2 = (C9649l) obj3;
                AbstractC10999l.mopub(c9649l2.f19681l.crashlytics(), null, 0, new C3652l(c9649l2, ((C12121l) obj).yandex, null, 1), 3);
                return Unit.INSTANCE;
        }
    }
}
