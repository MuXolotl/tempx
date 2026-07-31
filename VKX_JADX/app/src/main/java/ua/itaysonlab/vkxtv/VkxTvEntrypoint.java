package ua.itaysonlab.vkxtv;

import android.os.Bundle;
import defpackage.AbstractActivityC14666l;
import defpackage.AbstractC12846l;
import defpackage.AbstractC14289l;
import defpackage.AbstractC18202l;
import defpackage.C0194l;
import defpackage.C0760l;
import defpackage.C10023l;
import defpackage.C12214l;
import defpackage.C13689l;
import defpackage.C1527l;
import defpackage.C15578l;
import defpackage.C1588l;
import defpackage.C15942l;
import defpackage.C16390l;
import defpackage.C16793l;
import defpackage.C1712l;
import defpackage.C18396l;
import defpackage.C3095l;
import defpackage.C3321l;
import defpackage.C3464l;
import defpackage.C4983l;
import defpackage.C6168l;
import defpackage.C6921l;
import defpackage.C7502l;
import defpackage.C7695l;
import defpackage.C8339l;
import defpackage.C9282l;
import defpackage.InterfaceC1388l;
import defpackage.InterfaceC16588l;
import defpackage.InterfaceC3335l;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class VkxTvEntrypoint extends AbstractActivityC14666l {

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final /* synthetic */ int f36854l = 0;

    /* JADX WARN: Code duplicated, block: B:13:0x0072  */
    /* JADX WARN: Code duplicated, block: B:20:0x007d  */
    @Override // defpackage.AbstractActivityC14666l, defpackage.AbstractActivityC11746l, android.app.Activity
    public final void onCreate(Bundle bundle) throws IOException {
        C7695l c7695l;
        C7695l c7695l2;
        Object objSubs;
        super.onCreate(bundle);
        final C1712l c1712l = new C1712l(14);
        C16390l c16390lYandex = yandex();
        C3464l c3464l = new C3464l();
        C4983l c4983l = new C4983l(c3464l);
        Object objYandex = null;
        C0760l c0760l = new C0760l(c4983l, new C9282l(c4983l, null));
        c4983l.yandex.add(c0760l);
        C1527l.yandex(c16390lYandex.loadAd().crashlytics, c0760l);
        C18396l c18396l = (C18396l) this.f28688l.f26580l;
        Bundle bundleTapsense = c18396l.tapsense("STATE_KEEPER_STATE");
        if (bundleTapsense != null) {
            InterfaceC16588l interfaceC16588lSerializer = C7695l.Companion.serializer();
            ClassLoader classLoader = bundleTapsense.getClassLoader();
            try {
                bundleTapsense.setClassLoader(C13689l.class.getClassLoader());
                C13689l c13689l = (C13689l) bundleTapsense.getParcelable("STATE_KEEPER_STATE");
                bundleTapsense.setClassLoader(classLoader);
                if (c13689l == null) {
                    objSubs = null;
                } else {
                    objSubs = c13689l.f26731l;
                    if (objSubs == null) {
                        byte[] bArr = (byte[]) c13689l.f26730l.getValue();
                        if (bArr != null) {
                            objSubs = AbstractC14289l.subs(interfaceC16588lSerializer, bArr);
                        } else {
                            objSubs = null;
                        }
                    }
                }
                c7695l = (C7695l) objSubs;
                if (c7695l == null) {
                    c7695l = null;
                }
            } catch (Throwable th) {
                bundleTapsense.setClassLoader(classLoader);
                throw th;
            }
        } else {
            c7695l = null;
        }
        final C10023l c10023l = new C10023l(c7695l);
        c18396l.m4528synchronized("STATE_KEEPER_STATE", new InterfaceC3335l() { // from class: lؔۧۧ
            @Override // defpackage.InterfaceC3335l
            public final Bundle yandex() {
                Bundle bundle2 = new Bundle();
                if (((Boolean) c1712l.invoke()).booleanValue()) {
                    C7695l c7695lM2834volatile = c10023l.m2834volatile();
                    bundle2.putParcelable("STATE_KEEPER_STATE", new C13689l(c7695lM2834volatile, new C8688l(new Ctry(c7695lM2834volatile, C7695l.Companion.serializer(), 24))));
                }
                return bundle2;
            }
        });
        C0194l c0194l = C0194l.yandex;
        Map map = (Map) c10023l.f20419l;
        if (map != null && (c7695l2 = (C7695l) map.remove("DefaultComponentContext_state_marker")) != null) {
            objYandex = c7695l2.yandex(c0194l);
        }
        String str = (String) objYandex;
        c10023l.m2832synchronized("DefaultComponentContext_state_marker", c0194l, new C3321l(12));
        C10023l c10023l2 = new C10023l(this.f23523l);
        int i = 0;
        boolean z = str == null;
        C7502l c7502l = new C7502l(firebase(), new C6168l(24), C12214l.loadAd);
        InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C1588l.class);
        String strBilling = interfaceC1388lLoadAd.billing();
        if (strBilling == null) {
            C8339l.metrica("Local and anonymous classes can not be ViewModels");
            return;
        }
        C1588l c1588l = (C1588l) c7502l.crashlytics(interfaceC1388lLoadAd, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strBilling));
        if (z) {
            c1588l.loadAd.admob();
            c1588l.loadAd = new C6921l(4);
        }
        AbstractC12846l.yandex(this, new C15578l(1696222627, true, new C15942l(new C3095l(new C16793l(c10023l2, c10023l, c1588l.loadAd, c3464l)), i)));
    }
}
