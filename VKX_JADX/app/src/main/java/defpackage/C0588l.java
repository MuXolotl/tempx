package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؑۛۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0588l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ String f2021l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f2022l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f2023l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0588l(String str, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f2022l = i;
        this.f2021l = str;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        Map mapSingletonMap;
        switch (this.f2022l) {
            case 0:
                C7814l c7814l = (C7814l) this.f2023l;
                AbstractC2829l.crashlytics(obj);
                return C7814l.loadAd(c7814l, null, this.f2021l, System.currentTimeMillis(), null, 927);
            case 1:
                C3278l c3278l = (C3278l) this.f2023l;
                AbstractC2829l.crashlytics(obj);
                return C3278l.loadAd(c3278l, false, this.f2021l, null, false, 253);
            default:
                C15343l c15343l = (C15343l) this.f2023l;
                AbstractC2829l.crashlytics(obj);
                LinkedHashMap linkedHashMap = new LinkedHashMap(c15343l.f29992l);
                linkedHashMap.remove(this.f2021l);
                int size = linkedHashMap.size();
                if (size == 0) {
                    mapSingletonMap = C14054l.f27396l;
                } else if (size == 1) {
                    mapSingletonMap = linkedHashMap;
                    Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                    mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
                }
                mapSingletonMap = linkedHashMap;
                return C15343l.loadAd(c15343l, 0, 0, 0, 0, 0, 0, false, false, false, false, mapSingletonMap, 0, false, 15359);
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        switch (this.f2022l) {
            case 0:
                C0588l c0588l = new C0588l(this.f2021l, interfaceC14029l, 0);
                c0588l.f2023l = obj;
                return c0588l;
            case 1:
                C0588l c0588l2 = new C0588l(this.f2021l, interfaceC14029l, 1);
                c0588l2.f2023l = obj;
                return c0588l2;
            default:
                C0588l c0588l3 = new C0588l(this.f2021l, interfaceC14029l, 2);
                c0588l3.f2023l = obj;
                return c0588l3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2022l) {
            case 0:
                return ((C0588l) ads((InterfaceC14029l) obj2, (C7814l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C0588l) ads((InterfaceC14029l) obj2, (C3278l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C0588l) ads((InterfaceC14029l) obj2, (C15343l) obj)).Signature(Unit.INSTANCE);
        }
    }
}
