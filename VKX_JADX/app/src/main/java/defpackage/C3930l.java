package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؖؗۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3930l implements InterfaceC5010l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public C1790l f8090l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ArrayList f8091l = new ArrayList();

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public EnumC12305l f8092l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C11520l f8093l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C2421l f8094l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public List f8095l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public String f8096l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Integer f8097l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Integer f8098l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public boolean f8099l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public C4273l f8100l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f8101l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public boolean f8102l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public C8379l f8103l;

    @Override // defpackage.InterfaceC4831l
    public final Object yandex() {
        int iIntValue;
        List list = this.f8095l;
        Integer num = this.f8098l;
        int iIntValue2 = 0;
        ArrayList arrayList = this.f8091l;
        if (num == null) {
            Iterator it = arrayList.iterator();
            float fMax = 0.0f;
            while (it.hasNext()) {
                C11520l c11520l = ((C0657l) it.next()).loadAd;
                if (c11520l != null) {
                    fMax = Math.max(fMax, c11520l.yandex);
                }
            }
            iIntValue = 0;
        } else {
            iIntValue = num.intValue();
        }
        boolean z = this.f8101l;
        C2421l c2421l = this.f8094l;
        boolean z2 = !this.f8102l;
        Integer num2 = this.f8097l;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        return new C9173l(arrayList, list, iIntValue, c2421l, iIntValue2, z, z2, this.f8092l);
    }
}
