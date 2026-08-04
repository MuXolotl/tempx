package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lَُؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3318l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f7074l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7075l;

    public /* synthetic */ C3318l(int i, ArrayList arrayList) {
        this.f7075l = i;
        this.f7074l = arrayList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f7075l;
        int i2 = 0;
        ArrayList arrayList = this.f7074l;
        switch (i) {
            case 0:
                return ((InterfaceC13012l) arrayList.get(0)).mo1616package();
            default:
                if (arrayList.isEmpty()) {
                    return C2580l.f5619l;
                }
                if (((CharSequence) AbstractC16901l.m4231native(arrayList)).length() == 0 && arrayList.size() > 1) {
                    i2 = 1;
                }
                return arrayList.subList(i2, ((CharSequence) AbstractC16901l.m4214continue(arrayList)).length() == 0 ? AbstractC14055l.smaato(arrayList) : AbstractC14055l.smaato(arrayList) + 1);
        }
    }
}
