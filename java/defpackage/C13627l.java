package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lْۙۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13627l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ List f26655l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26656l;

    public /* synthetic */ C13627l(int i, List list) {
        this.f26656l = i;
        this.f26655l = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f26656l;
        List list = this.f26655l;
        switch (i) {
            case 0:
                Integer num = (Integer) list.get(2);
                num.intValue();
                return num;
            case 1:
                return list;
            case 2:
                C10244l c10244l = C10244l.purchase;
                StringBuilder sb = new StringBuilder();
                C16287l.yandex.getClass();
                sb.append(C16287l.crashlytics());
                sb.append(list.hashCode());
                c10244l.loadAd(new C17050l(sb.toString(), "Мультивыбор", list));
                return Unit.INSTANCE;
            case 3:
                return ((InterfaceC13012l) list.get(0)).mo1616package();
            default:
                return ((InterfaceC13012l) list.get(0)).mo1616package();
        }
    }
}
