package defpackage;

import android.os.Build;
import java.util.Collections;
import kotlin.Unit;

/* JADX INFO: renamed from: lؒۦؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1478l extends AbstractC13852l {
    public final /* synthetic */ int amazon;
    public final C8195l purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1478l(String str, int i) {
        super(Unit.class, "/track/async_stat");
        this.amazon = i;
        switch (i) {
            case 3:
                super(Unit.class, "/track/stat");
                this.purchase = new C8195l("PUT", AbstractC8676l.remoteconfig(new C8195l("device_type", "mobile"), new C8195l("device_model", Build.MODEL), new C8195l("device_make", Build.MANUFACTURER), new C8195l("os_version", "Android " + Build.VERSION.SDK_INT + ' ' + Build.VERSION.RELEASE), new C8195l("platform", "android"), new C8195l("data", str)));
                break;
            default:
                this.purchase = new C8195l("POST", Collections.singletonMap("data", str));
                break;
        }
    }

    @Override // defpackage.AbstractC13852l
    public final C8195l amazon() {
        switch (this.amazon) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.purchase;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1478l(String str, boolean z, int i) {
        super(Unit.class, AbstractC15560l.Signature("/track/", str, "/dislike"));
        this.amazon = i;
        switch (i) {
            case 1:
                super(Unit.class, AbstractC15560l.Signature("/track/", str, "/like"));
                this.purchase = new C8195l(z ? "PUT" : "DELETE", C14054l.f27396l);
                break;
            default:
                this.purchase = new C8195l(z ? "PUT" : "DELETE", Collections.singletonMap("source_client", "mix_smart"));
                break;
        }
    }
}
