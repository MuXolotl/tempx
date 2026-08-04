package defpackage;

import bruhcollective.itaysonlab.libvkmusic.methods.uma.GetPersonalRadio$Preapi;
import bruhcollective.itaysonlab.libvkmusic.objects.RadioInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍۖؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9738l extends AbstractC0301l {
    public final Function1 crashlytics;
    public final String loadAd;
    public final String yandex;

    public AbstractC9738l(String str, String str2, Function1 function1) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = function1;
    }

    @Override // defpackage.AbstractC0301l
    public final String amazon(RadioInfo radioInfo) {
        return (String) this.crashlytics.invoke(radioInfo);
    }

    @Override // defpackage.AbstractC0301l
    public final String crashlytics() {
        return "/radio/" + this.yandex + '/' + this.loadAd;
    }

    @Override // defpackage.AbstractC0301l
    public final AbstractC13852l loadAd() {
        return new C6841l(GetPersonalRadio$Preapi.class, "/radio/" + this.yandex + '/' + this.loadAd + '/');
    }

    @Override // defpackage.AbstractC0301l
    public final String yandex() {
        return "uma_" + this.yandex + ':' + this.loadAd;
    }
}
