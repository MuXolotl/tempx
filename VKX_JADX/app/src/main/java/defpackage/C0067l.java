package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؑؔؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0067l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f965l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8714l f966l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f967l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ boolean f968l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ List f969l;

    public /* synthetic */ C0067l(InterfaceC8714l interfaceC8714l, ArrayList arrayList, List list, boolean z, int i) {
        this.f967l = i;
        this.f966l = interfaceC8714l;
        this.f965l = arrayList;
        this.f969l = list;
        this.f968l = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f967l;
        boolean z = this.f968l;
        List list = this.f969l;
        ArrayList arrayList = this.f965l;
        InterfaceC8714l interfaceC8714l = this.f966l;
        AbstractC9601l abstractC9601l = (AbstractC9601l) obj;
        switch (i) {
            case 0:
                abstractC9601l.f19562l = true;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C9696l) arrayList.get(i2)).crashlytics(abstractC9601l, z);
                }
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((C9696l) list.get(i3)).crashlytics(abstractC9601l, z);
                }
                Unit unit = Unit.INSTANCE;
                abstractC9601l.f19562l = false;
                interfaceC8714l.getValue();
                break;
            default:
                abstractC9601l.f19562l = true;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    ((C15237l) arrayList.get(i4)).crashlytics(abstractC9601l, z);
                }
                int size4 = list.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    ((C15237l) list.get(i5)).crashlytics(abstractC9601l, z);
                }
                Unit unit2 = Unit.INSTANCE;
                abstractC9601l.f19562l = false;
                interfaceC8714l.getValue();
                break;
        }
        return Unit.INSTANCE;
    }
}
