package defpackage;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;

/* JADX INFO: renamed from: lًۛۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8271l extends Cgoto {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C7854l f17174l;

    public C8271l(C7854l c7854l) {
        super(9);
        this.f17174l = c7854l;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    @Override // defpackage.Cgoto
    /* JADX INFO: renamed from: lٍۤٙ */
    public final Object mo219l(Object obj) {
        C17781l c17781lCrashlytics;
        InterfaceC3634l c16308l;
        C7854l c7854l = this.f17174l;
        C14605l c14605l = (C14605l) obj;
        Context contextLoadAd = c7854l.loadAd();
        String str = true != AbstractC14693l.crashlytics() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
        synchronized (AbstractC12366l.class) {
            c17781lCrashlytics = AbstractC12366l.crashlytics(new C17413l(str, 1));
        }
        C2673l c2673l = C16308l.f31895l;
        if (C7269l.yandex(contextLoadAd, ModuleDescriptor.MODULE_ID) > 0) {
            c16308l = new C16308l(contextLoadAd, c14605l, c17781lCrashlytics);
        } else {
            C13268l.loadAd.getClass();
            if (C13268l.yandex(contextLoadAd) >= 204500000) {
                c16308l = new C16308l(contextLoadAd, c14605l, c17781lCrashlytics);
            } else {
                c16308l = new C18480l(contextLoadAd, c14605l, c17781lCrashlytics);
            }
        }
        return new C1976l(c7854l, c14605l, c16308l, c17781lCrashlytics);
    }
}
