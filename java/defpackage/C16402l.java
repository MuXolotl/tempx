package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٖٕٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16402l extends AbstractC5563l implements Function2 {
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws IOException {
        AbstractC2829l.crashlytics(obj);
        VKXApplication.Companion companion = VKXApplication.f36628l;
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        InputStream inputStreamOpen = vKXApplication.getAssets().open("vkx_eq_prebuilt_vk.json");
        try {
            C15913l c15913l = AbstractC8237l.amazon;
            c15913l.getClass();
            List<C7843l> list = (List) AbstractC7876l.crashlytics(c15913l, new C0087l(C7843l.Companion.serializer(), 0), inputStreamOpen);
            AbstractC7876l.loadAd(inputStreamOpen, null);
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
            for (C7843l c7843l : list) {
                String str = c7843l.yandex;
                String str2 = c7843l.loadAd;
                List list2 = C13434l.mopub;
                List list3 = c7843l.crashlytics;
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new Double(((Number) it.next()).doubleValue() * 12.0d));
                }
                arrayList.add(new C11359l(str, str2, false, list2, arrayList2));
            }
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC7876l.loadAd(inputStreamOpen, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C16402l(2, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C16402l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
