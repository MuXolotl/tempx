package defpackage;

import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: renamed from: lؚؕٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3437l implements InterfaceC9427l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f7311l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f7312l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7313l;

    public /* synthetic */ C3437l(ArrayList arrayList, InterfaceC8714l interfaceC8714l, int i) {
        this.f7313l = i;
        this.f7312l = arrayList;
        this.f7311l = interfaceC8714l;
    }

    @Override // defpackage.InterfaceC9427l
    public final Object isPro(Object obj, InterfaceC14029l interfaceC14029l) {
        int i = this.f7313l;
        InterfaceC8714l interfaceC8714l = this.f7311l;
        ArrayList arrayList = this.f7312l;
        switch (i) {
            case 0:
                InterfaceC12553l interfaceC12553l = (InterfaceC12553l) obj;
                if (interfaceC12553l instanceof C1612l) {
                    arrayList.add(interfaceC12553l);
                } else if (interfaceC12553l instanceof C0927l) {
                    arrayList.remove(((C0927l) interfaceC12553l).yandex);
                }
                interfaceC8714l.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 1:
                InterfaceC12553l interfaceC12553l2 = (InterfaceC12553l) obj;
                if (interfaceC12553l2 instanceof C1311l) {
                    arrayList.add(interfaceC12553l2);
                } else if (interfaceC12553l2 instanceof C15758l) {
                    arrayList.remove(((C15758l) interfaceC12553l2).yandex);
                } else if (interfaceC12553l2 instanceof C15366l) {
                    arrayList.remove(((C15366l) interfaceC12553l2).yandex);
                }
                interfaceC8714l.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 2:
                InterfaceC12553l interfaceC12553l3 = (InterfaceC12553l) obj;
                if (interfaceC12553l3 instanceof C7008l) {
                    arrayList.add(interfaceC12553l3);
                } else if (interfaceC12553l3 instanceof C17768l) {
                    arrayList.remove(((C17768l) interfaceC12553l3).yandex);
                }
                interfaceC8714l.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            default:
                InterfaceC12553l interfaceC12553l4 = (InterfaceC12553l) obj;
                if (interfaceC12553l4 instanceof C12951l) {
                    arrayList.add(interfaceC12553l4);
                } else if (interfaceC12553l4 instanceof C3426l) {
                    arrayList.remove(((C3426l) interfaceC12553l4).yandex);
                } else if (interfaceC12553l4 instanceof C10129l) {
                    arrayList.remove(((C10129l) interfaceC12553l4).yandex);
                }
                interfaceC8714l.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
        }
        return Unit.INSTANCE;
    }
}
