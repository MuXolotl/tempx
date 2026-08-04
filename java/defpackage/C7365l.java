package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؚٛۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7365l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f15272l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f15273l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15274l;

    public /* synthetic */ C7365l(int i, Collection collection) {
        this.f15274l = 2;
        this.f15273l = i;
        this.f15272l = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f15274l;
        int i2 = this.f15273l;
        Object obj2 = this.f15272l;
        switch (i) {
            case 0:
                C8929l c8929l = (C8929l) obj;
                C18145l c18145l = ((C8232l) obj2).yandex;
                AbstractC18620l abstractC18620lBilling = AbstractC7572l.billing();
                AbstractC7572l.startapp(abstractC18620lBilling, AbstractC7572l.remoteconfig(abstractC18620lBilling), abstractC18620lBilling != null ? abstractC18620lBilling.purchase() : null);
                c18145l.getClass();
                int i3 = c8929l.yandex != -1 ? c8929l.yandex : 2;
                for (int i4 = 0; i4 < i3; i4++) {
                    c8929l.yandex(i2 + i4);
                }
                return Unit.INSTANCE;
            case 1:
                AbstractC13264l abstractC13264l = (AbstractC13264l) obj2;
                C6148l c6148l = (C6148l) obj;
                float fAbs = Math.abs(((C13765l) abstractC13264l.amazon.f32505l).admob() + (((C15308l) abstractC13264l.amazon.f32506l).admob() - i2));
                c6148l.crashlytics(AbstractC10310l.tapsense(0.5f, 1.0f, 1.0f - AbstractC8576l.amazon(fAbs, 0.0f, 1.0f)));
                float fTapsense = AbstractC10310l.tapsense(0.75f, 1.0f, 1.0f - AbstractC8576l.amazon(fAbs, 0.0f, 1.0f));
                c6148l.remoteconfig(fTapsense);
                c6148l.vip(fTapsense);
                return Unit.INSTANCE;
            case 2:
                return Boolean.valueOf(((List) obj).addAll(i2, (Collection) obj2));
            default:
                C14089l c14089l = (C14089l) obj2;
                C1336l c1336l = (C1336l) obj;
                InterfaceC8714l interfaceC8714l = c14089l.f27451l[i2];
                InterfaceC8714l interfaceC8714l2 = c14089l.f27449l[i2];
                AbstractC18082l abstractC18082l = (AbstractC18082l) interfaceC8714l.getValue();
                c1336l.firebase(abstractC18082l.pro(), null, new C2214l(abstractC18082l, 2), new C15578l(802480018, true, new C11074l(abstractC18082l, c14089l, 1)));
                if (((Boolean) interfaceC8714l2.getValue()).booleanValue()) {
                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-582281940, true, new C1866l(c14089l, i2, 7)), 3);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C7365l(Object obj, int i, int i2) {
        this.f15274l = i2;
        this.f15272l = obj;
        this.f15273l = i;
    }
}
