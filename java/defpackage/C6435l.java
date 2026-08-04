package defpackage;

import bruhcollective.itaysonlab.libvkmusic.methods.uma.GetPersonalRadio$Preapi;
import bruhcollective.itaysonlab.libvkmusic.objects.RadioCluster;
import bruhcollective.itaysonlab.libvkmusic.objects.RadioInfo;

/* JADX INFO: renamed from: lؙْۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6435l extends AbstractC0301l {
    @Override // defpackage.AbstractC0301l
    public final String amazon(RadioInfo radioInfo) {
        String str;
        RadioCluster radioCluster = radioInfo.crashlytics;
        return (radioCluster == null || (str = radioCluster.purchase) == null) ? "VK Mix" : str;
    }

    @Override // defpackage.AbstractC0301l
    public final String crashlytics() {
        return "/radio/personal/";
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C6435l);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.AbstractC0301l
    public final AbstractC13852l loadAd() {
        return new C6841l(GetPersonalRadio$Preapi.class, "/radio/personal/");
    }

    public final String toString() {
        return "Personal(clusterId=null)";
    }

    @Override // defpackage.AbstractC0301l
    public final String yandex() {
        return "uma_personal";
    }
}
