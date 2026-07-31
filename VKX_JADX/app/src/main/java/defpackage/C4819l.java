package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lُؗۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4819l extends AbstractC16915l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f9866l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f9867l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4819l(int i, ArrayList arrayList) {
        super(1);
        this.f9867l = i;
        this.f9866l = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f9867l;
        ArrayList arrayList = this.f9866l;
        switch (i) {
            case 0:
                AbstractC9601l abstractC9601l = (AbstractC9601l) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    AbstractC9601l.smaato(abstractC9601l, (AbstractC10113l) arrayList.get(i2), 0, 0);
                }
                break;
            case 1:
                AbstractC9601l abstractC9601l2 = (AbstractC9601l) obj;
                int iSmaato = AbstractC14055l.smaato(arrayList);
                if (iSmaato >= 0) {
                    int i3 = 0;
                    while (true) {
                        AbstractC9601l.smaato(abstractC9601l2, (AbstractC10113l) arrayList.get(i3), 0, 0);
                        if (i3 != iSmaato) {
                            i3++;
                        }
                    }
                }
                break;
            case 2:
                AbstractC9601l abstractC9601l3 = (AbstractC9601l) obj;
                int size2 = arrayList.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    abstractC9601l3.mopub((AbstractC10113l) arrayList.get(i4), 0, 0, 0.0f);
                }
                break;
            default:
                AbstractC9601l abstractC9601l4 = (AbstractC9601l) obj;
                int size3 = arrayList.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    AbstractC9601l.remoteconfig(abstractC9601l4, (AbstractC10113l) arrayList.get(i5), 0, 0, null, 12);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
