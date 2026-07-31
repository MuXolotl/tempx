package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؓۥً, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2228l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ long f4904l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C1332l f4905l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4906l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f4907l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f4908l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Map f4909l;

    public /* synthetic */ C2228l(C1332l c1332l, long j, Object obj, int i, Map map, int i2) {
        this.f4906l = i2;
        this.f4905l = c1332l;
        this.f4904l = j;
        this.f4908l = obj;
        this.f4907l = i;
        this.f4909l = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f4906l;
        Map map = this.f4909l;
        int i2 = this.f4907l;
        Object obj2 = this.f4908l;
        long j = this.f4904l;
        C1332l c1332l = this.f4905l;
        switch (i) {
            case 0:
                LongPointerWrapper longPointerWrapper = c1332l.f3422l;
                long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
                int i3 = AbstractC9795l.yandex;
                realmcJNI.realm_set_list(ptr$cinterop_release, j);
                LongPointerWrapper longPointerWrapper2 = new LongPointerWrapper(realmcJNI.realm_get_list(longPointerWrapper.getPtr$cinterop_release(), j), false, 2, null);
                realmcJNI.realm_list_clear(longPointerWrapper2.getPtr$cinterop_release());
                return Boolean.valueOf(AbstractC1757l.mopub(new C4619l(c1332l.f3423l, c1332l.f3419l, longPointerWrapper2, false, false), 0, (InterfaceC11334l) ((C14076l) ((InterfaceC3327l) obj2)).smaato(12), i2, map));
            default:
                LongPointerWrapper longPointerWrapper3 = c1332l.f3422l;
                long ptr$cinterop_release2 = longPointerWrapper3.getPtr$cinterop_release();
                int i4 = AbstractC9795l.yandex;
                realmcJNI.realm_set_dictionary(ptr$cinterop_release2, j);
                LongPointerWrapper longPointerWrapper4 = new LongPointerWrapper(realmcJNI.realm_get_dictionary(longPointerWrapper3.getPtr$cinterop_release(), j), false, 2, null);
                realmcJNI.realm_dictionary_clear(longPointerWrapper4.getPtr$cinterop_release());
                AbstractC1757l.pro(AbstractC7477l.purchase(c1332l.f3423l, c1332l.f3419l, longPointerWrapper4, false, false), (InterfaceC2599l) ((C14076l) ((InterfaceC3327l) obj2)).smaato(13), i2, map);
                return Unit.INSTANCE;
        }
    }
}
