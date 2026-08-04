package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؒۖؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1247l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ int f3270l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f3271l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3272l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f3273l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f3274l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f3275l;

    public /* synthetic */ C1247l(ArrayList arrayList, C7234l c7234l, int i, ArrayList arrayList2, int i2) {
        this.f3272l = 2;
        this.f3271l = arrayList;
        this.f3275l = c7234l;
        this.f3270l = i;
        this.f3273l = arrayList2;
        this.f3274l = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC9671l interfaceC9671lSubs;
        C1332l f36807l;
        int i = this.f3272l;
        Object obj2 = this.f3273l;
        int i2 = this.f3274l;
        Object obj3 = this.f3275l;
        int iIntValue = this.f3270l;
        Object obj4 = this.f3271l;
        switch (i) {
            case 0:
                C4619l c4619l = (C4619l) obj4;
                Map map = (Map) obj3;
                C3585l c3585l = (C3585l) obj2;
                InterfaceC3327l interfaceC3327l = (InterfaceC3327l) obj;
                boolean z = c4619l.f9370l;
                if (z) {
                    interfaceC9671lSubs = ((C14076l) interfaceC3327l).subs(AbstractC18202l.yandex.loadAd(InterfaceC11343l.class));
                } else {
                    if (z) {
                        C18725l.billing();
                        return null;
                    }
                    interfaceC9671lSubs = ((C14076l) interfaceC3327l).subs(AbstractC18202l.yandex.loadAd(InterfaceC7457l.class));
                }
                C5501l c5501l = (C5501l) c4619l.f9373l;
                InterfaceC7832l interfaceC7832l = (InterfaceC7832l) c4619l.f9372l;
                if (interfaceC9671lSubs != null) {
                    C1332l f36807l2 = ((InterfaceC2851l) interfaceC9671lSubs).getF36705l();
                    if (f36807l2 == null) {
                        interfaceC9671lSubs = AbstractC5661l.yandex(c5501l, interfaceC7832l.mo1846l(), interfaceC9671lSubs, iIntValue, map);
                    } else if (!AbstractC8576l.yandex(f36807l2.f3419l, interfaceC7832l)) {
                        C8339l.metrica("Cannot import an outdated object. Use findLatest(object) to find an\nup-to-date version of the object in the given context before importing\nit.");
                        return null;
                    }
                } else {
                    interfaceC9671lSubs = null;
                }
                f36807l = interfaceC9671lSubs != null ? ((InterfaceC2851l) interfaceC9671lSubs).getF36705l() : null;
                LongPointerWrapper longPointerWrapper = (LongPointerWrapper) c4619l.f9374l;
                realm_value_t realm_value_tVarInmobi = c3585l.inmobi(f36807l);
                long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
                int i3 = AbstractC9795l.yandex;
                realmcJNI.realm_list_insert(ptr$cinterop_release, i2, realm_value_tVarInmobi.yandex, realm_value_tVarInmobi);
                return Unit.INSTANCE;
            case 1:
                C4619l c4619l2 = (C4619l) obj4;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                C3585l c3585l2 = (C3585l) obj2;
                InterfaceC9671l interfaceC9671lSubs2 = ((C14076l) ((InterfaceC3327l) obj)).subs(AbstractC18202l.yandex.loadAd(InterfaceC9671l.class));
                C5501l c5501l2 = (C5501l) c4619l2.f9373l;
                InterfaceC7832l interfaceC7832l2 = (InterfaceC7832l) c4619l2.f9372l;
                if (interfaceC9671lSubs2 != null) {
                    C1332l f36807l3 = ((InterfaceC2851l) interfaceC9671lSubs2).getF36705l();
                    if (f36807l3 == null) {
                        interfaceC9671lSubs2 = AbstractC5661l.yandex(c5501l2, interfaceC7832l2.mo1846l(), interfaceC9671lSubs2, iIntValue, linkedHashMap);
                    } else if (!AbstractC8576l.yandex(f36807l3.f3419l, interfaceC7832l2)) {
                        C8339l.metrica("Cannot import an outdated object. Use findLatest(object) to find an\nup-to-date version of the object in the given context before importing\nit.");
                        return null;
                    }
                } else {
                    interfaceC9671lSubs2 = null;
                }
                f36807l = interfaceC9671lSubs2 != null ? ((InterfaceC2851l) interfaceC9671lSubs2).getF36705l() : null;
                LongPointerWrapper longPointerWrapper2 = (LongPointerWrapper) c4619l2.f9374l;
                realm_value_t realm_value_tVarInmobi2 = c3585l2.inmobi(f36807l);
                long ptr$cinterop_release2 = longPointerWrapper2.getPtr$cinterop_release();
                int i4 = AbstractC9795l.yandex;
                realmcJNI.realm_list_set(ptr$cinterop_release2, i2, realm_value_tVarInmobi2.yandex, realm_value_tVarInmobi2);
                return Unit.INSTANCE;
            case 2:
                ArrayList arrayList = (ArrayList) obj4;
                C7234l c7234l = (C7234l) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                AbstractC9601l abstractC9601l = (AbstractC9601l) obj;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    AbstractC10113l abstractC10113l = (AbstractC10113l) arrayList.get(i5);
                    abstractC9601l.mopub(abstractC10113l, 0, (i2 - abstractC10113l.f20591l) / 2, 0.0f);
                }
                C7069l c7069l = C7069l.yandex;
                abstractC9601l.getClass();
                int iYandex = AbstractC9361l.yandex(abstractC9601l, 8.0f) + AbstractC9361l.yandex(abstractC9601l, 18.0f);
                C5616l c5616l = c7234l.crashlytics;
                if (c5616l != null) {
                    iIntValue = ((Number) c5616l.amazon()).intValue();
                }
                int i6 = iYandex + iIntValue;
                int size2 = arrayList2.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    AbstractC10113l abstractC10113l2 = (AbstractC10113l) arrayList2.get(i7);
                    abstractC9601l.mopub(abstractC10113l2, i6, (i2 - abstractC10113l2.f20591l) / 2, 0.0f);
                }
                return Unit.INSTANCE;
            default:
                AbstractC10113l abstractC10113l3 = (AbstractC10113l) obj3;
                AbstractC9601l.isPro((AbstractC9601l) obj, abstractC10113l3, ((C5177l) ((C6868l) obj4).f14368l.invoke(new C4999l((((long) (iIntValue - abstractC10113l3.f20592l)) << 32) | (((long) (i2 - abstractC10113l3.f20591l)) & 4294967295L)), ((InterfaceC7448l) obj2).getLayoutDirection())).yandex);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C1247l(int i, int i2, int i3, Object obj, Object obj2, Object obj3) {
        this.f3272l = i3;
        this.f3271l = obj;
        this.f3270l = i;
        this.f3275l = obj2;
        this.f3274l = i2;
        this.f3273l = obj3;
    }
}
