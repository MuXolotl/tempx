package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُۘۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11281l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ String f22719l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ String f22720l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f22721l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f22722l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11281l(String str, String str2, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f22721l = i;
        this.f22719l = str;
        this.f22720l = str2;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        Map mapSingletonMap;
        int i = this.f22721l;
        String str = this.f22720l;
        String str2 = this.f22719l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                C16221l c16221l = (C16221l) this.f22722l;
                C16221l c16221lPurchase = c16221l.purchase();
                C16033l c16033l = C12183l.mopub;
                Set set = (Set) c16221l.crashlytics(c16033l);
                if (set == null) {
                    set = C5746l.f12138l;
                }
                c16221lPurchase.amazon(c16033l, AbstractC9905l.admob(set, str2));
                c16221lPurchase.amazon(C3067l.loadAd(C12183l.amazon, str2), str);
                return c16221lPurchase.billing();
            default:
                C15343l c15343l = (C15343l) this.f22722l;
                AbstractC2829l.crashlytics(obj);
                Map map = c15343l.f29992l;
                if (map.isEmpty()) {
                    mapSingletonMap = Collections.singletonMap(str2, str);
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                    linkedHashMap.put(str2, str);
                    mapSingletonMap = linkedHashMap;
                }
                return C15343l.loadAd(c15343l, 0, 0, 0, 0, 0, 0, false, false, false, false, mapSingletonMap, 0, false, 15359);
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f22721l;
        String str = this.f22720l;
        String str2 = this.f22719l;
        switch (i) {
            case 0:
                C11281l c11281l = new C11281l(str2, str, interfaceC14029l, 0);
                c11281l.f22722l = obj;
                return c11281l;
            default:
                C11281l c11281l2 = new C11281l(str2, str, interfaceC14029l, 1);
                c11281l2.f22722l = obj;
                return c11281l2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22721l) {
            case 0:
                return ((C11281l) ads((InterfaceC14029l) obj2, (C16221l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C11281l) ads((InterfaceC14029l) obj2, (C15343l) obj)).Signature(Unit.INSTANCE);
        }
    }
}
