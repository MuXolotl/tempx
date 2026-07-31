package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِْۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13313l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ float f26116l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ float f26117l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26118l = 0;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f26119l;

    public /* synthetic */ C13313l(float f, C8954l c8954l, float f2) {
        this.f26117l = f;
        this.f26119l = c8954l;
        this.f26116l = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.f26118l;
        float f = this.f26116l;
        float f2 = this.f26117l;
        Object obj2 = this.f26119l;
        switch (i) {
            case 0:
                C8954l c8954l = (C8954l) obj2;
                C0143l c0143l = (C0143l) obj;
                c0143l.yandex(EnumC9129l.f18765l, f2);
                Set set = c8954l.yandex;
                EnumC9129l enumC9129l = EnumC9129l.f18763l;
                if (set.contains(enumC9129l) && ((z = c8954l.purchase) || f > f2 / 2.0f)) {
                    c0143l.yandex(enumC9129l, f2 - (z ? Math.min(f2 / 2.0f, f) : f2 / 2.0f));
                }
                if (f != 0.0f) {
                    c0143l.yandex(EnumC9129l.f18764l, Math.max(0.0f, f2 - f));
                }
                break;
            default:
                ((AbstractC9601l) obj).mopub((AbstractC10113l) obj2, Math.round(f2), Math.round(f), 0.0f);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C13313l(AbstractC10113l abstractC10113l, float f, float f2) {
        this.f26119l = abstractC10113l;
        this.f26117l = f;
        this.f26116l = f2;
    }
}
