package defpackage;

import io.realm.kotlin.dynamic.DynamicMutableRealmObject;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: renamed from: lُ٘ؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Llُ٘ؐ;", "Lio/realm/kotlin/dynamic/DynamicMutableRealmObject;", "Llؘؒٗ;", "io.realm.kotlin.library"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C11097l extends C1097l implements DynamicMutableRealmObject {
    @Override // io.realm.kotlin.dynamic.DynamicMutableRealmObject
    public final DynamicMutableRealmObject admob(Object obj, String str) {
        C2782l.subscription(this.f3035l, str, obj, 2, new LinkedHashMap());
        return this;
    }

    @Override // defpackage.C1097l, defpackage.InterfaceC11343l
    public final InterfaceC11334l firebase(String str) {
        return yandex(AbstractC18202l.yandex.loadAd(DynamicMutableRealmObject.class), str);
    }

    @Override // defpackage.C1097l, defpackage.InterfaceC11343l
    public final InterfaceC11343l mopub(String str) {
        return (DynamicMutableRealmObject) tapsense(AbstractC18202l.yandex.loadAd(DynamicMutableRealmObject.class), str);
    }

    @Override // defpackage.C1097l, defpackage.InterfaceC11343l
    public final Object smaato(InterfaceC1388l interfaceC1388l, String str) {
        return C2782l.adcel(this.f3035l, str, interfaceC1388l, false, true);
    }

    @Override // defpackage.C1097l, defpackage.InterfaceC11343l
    public final Object tapsense(InterfaceC1388l interfaceC1388l, String str) {
        return C2782l.adcel(this.f3035l, str, interfaceC1388l, true, true);
    }

    @Override // defpackage.C1097l
    public final C3364l yandex(InterfaceC1388l interfaceC1388l, String str) {
        return C2782l.ads(this.f3035l, str, interfaceC1388l, false, true);
    }
}
