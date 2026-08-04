package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَ۠ؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10612l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f21531l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21532l;

    public /* synthetic */ C10612l(int i, Object obj) {
        this.f21532l = i;
        this.f21531l = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f21532l;
        Object obj2 = this.f21531l;
        switch (i) {
            case 0:
                return AbstractC16901l.m4218final(obj2, (List) obj);
            case 1:
                List list = (List) obj;
                return AbstractC8576l.yandex(AbstractC16901l.m4214continue(list), obj2) ? list : AbstractC16901l.m4218final(obj2, list);
            case 2:
                List list2 = (List) obj;
                return AbstractC8576l.yandex(AbstractC16901l.m4214continue(list2), obj2) ? list2 : AbstractC16901l.m4218final(obj2, list2);
            default:
                List list3 = (List) obj;
                return AbstractC8576l.yandex(AbstractC16901l.m4214continue(list3), obj2) ? list3 : AbstractC16901l.m4218final(obj2, list3);
        }
    }
}
