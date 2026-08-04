package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؚۦٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7655l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f15776l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f15777l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f15778l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f15779l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f15780l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f15781l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f15782l;

    public /* synthetic */ C7655l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f15779l = i;
        this.f15778l = obj;
        this.f15776l = obj2;
        this.f15781l = obj3;
        this.f15780l = obj4;
        this.f15782l = obj5;
        this.f15777l = obj6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        int i = this.f15779l;
        Object obj = this.f15777l;
        Object obj2 = this.f15782l;
        Object obj3 = this.f15780l;
        Object obj4 = this.f15781l;
        Object obj5 = this.f15776l;
        Object obj6 = this.f15778l;
        switch (i) {
            case 0:
                C15543l c15543l = (C15543l) obj6;
                InterfaceC10315l interfaceC10315l = (InterfaceC10315l) obj5;
                InterfaceC2449l interfaceC2449l = (InterfaceC2449l) obj4;
                String str = (String) obj3;
                Object[] objArr = (Object[]) obj;
                boolean z2 = true;
                if (c15543l.f30377l != interfaceC2449l) {
                    c15543l.f30377l = interfaceC2449l;
                    z = true;
                } else {
                    z = false;
                }
                if (AbstractC8576l.yandex(c15543l.f30375l, str)) {
                    z2 = z;
                } else {
                    c15543l.f30375l = str;
                }
                c15543l.f30378l = interfaceC10315l;
                c15543l.f30380l = obj2;
                c15543l.f30379l = objArr;
                InterfaceC18327l interfaceC18327l = c15543l.f30381l;
                if (interfaceC18327l != null && z2) {
                    ((C5991l) interfaceC18327l).signatures();
                    c15543l.f30381l = null;
                    c15543l.amazon();
                }
                return Unit.INSTANCE;
            case 1:
                return Boolean.valueOf(((C1557l) obj6).yandex((C14591l) obj5, (ArrayList) obj4, (LinkedHashMap) obj3, (List) obj2, (ArrayList) obj));
            default:
                C10178l c10178l = (C10178l) obj6;
                C10178l c10178l2 = (C10178l) obj5;
                InterfaceC6497l interfaceC6497l = (InterfaceC6497l) obj4;
                C6523l c6523l = (C6523l) obj3;
                C6523l c6523l2 = (C6523l) obj2;
                C1930l c1930l = (C1930l) obj;
                if (c10178l.loadAd().f12057l.length() > 0 && c10178l2.loadAd().f12057l.length() > 0) {
                    AbstractC2812l.mopub(interfaceC6497l);
                    c6523l.yandex();
                    c6523l2.yandex();
                    c1930l.f4399l.setValue(c10178l.loadAd().f12057l.toString());
                    c1930l.f4397l.setValue(c10178l2.loadAd().f12057l.toString());
                    c1930l.f4395l.setValue(Boolean.FALSE);
                }
                return Unit.INSTANCE;
        }
    }
}
