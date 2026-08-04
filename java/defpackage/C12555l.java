package defpackage;

import io.realm.kotlin.dynamic.DynamicMutableRealmObject;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: renamed from: lِّۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Llِّۛ;", "Lio/realm/kotlin/dynamic/DynamicMutableRealmObject;", "Llؔۗۥ;", "io.realm.kotlin.library"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C12555l implements DynamicMutableRealmObject, InterfaceC2851l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C1332l f24738l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final LinkedHashMap f24739l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f24740l;

    public C12555l(String str, Map map) {
        this.f24740l = str;
        this.f24739l = new LinkedHashMap(map);
    }

    @Override // defpackage.InterfaceC2851l
    /* JADX INFO: renamed from: Signature, reason: from getter */
    public final C1332l getF24738l() {
        return this.f24738l;
    }

    @Override // io.realm.kotlin.dynamic.DynamicMutableRealmObject
    public final DynamicMutableRealmObject admob(Object obj, String str) {
        this.f24739l.put(str, obj);
        return this;
    }

    @Override // defpackage.InterfaceC2851l
    public final void ads(C1332l c1332l) {
        this.f24738l = c1332l;
    }

    @Override // defpackage.InterfaceC11343l
    public final InterfaceC11334l firebase(String str) {
        LinkedHashMap linkedHashMap = this.f24739l;
        Object objPurchase = linkedHashMap.get(str);
        if (objPurchase == null) {
            objPurchase = AbstractC15684l.purchase(new DynamicMutableRealmObject[0]);
            linkedHashMap.put(str, objPurchase);
        }
        return (InterfaceC11334l) objPurchase;
    }

    @Override // defpackage.InterfaceC11343l
    public final InterfaceC11343l mopub(String str) {
        return (DynamicMutableRealmObject) this.f24739l.get(str);
    }

    @Override // defpackage.InterfaceC11343l
    public final Object smaato(InterfaceC1388l interfaceC1388l, String str) {
        return this.f24739l.get(str);
    }

    @Override // defpackage.InterfaceC11343l
    public final Object tapsense(InterfaceC1388l interfaceC1388l, String str) {
        return this.f24739l.get(str);
    }
}
