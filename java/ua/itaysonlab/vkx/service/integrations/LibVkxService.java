package ua.itaysonlab.vkx.service.integrations;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.AbstractC14055l;
import defpackage.AbstractC8576l;
import defpackage.BinderC16109l;
import defpackage.BinderC3896l;
import defpackage.C10892l;
import defpackage.C5835l;
import defpackage.C8461l;
import defpackage.C8634l;
import defpackage.InterfaceC13922l;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class LibVkxService extends Service {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final List f36650l = AbstractC14055l.remoteconfig(new C8461l(0), new C8461l(1));

    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Object next;
        C8461l c8461l;
        C5835l c5835l;
        String action;
        String str;
        C10892l c10892l = C10892l.yandex;
        c10892l.getClass();
        C8634l c8634l = C10892l.metrica;
        InterfaceC13922l interfaceC13922l = C10892l.loadAd[9];
        if (((Boolean) c8634l.pro(c10892l)).booleanValue()) {
            Iterator it = this.f36650l.iterator();
            do {
                if (it.hasNext()) {
                    next = it.next();
                    C8461l c8461l2 = (C8461l) next;
                    action = intent != null ? intent.getAction() : null;
                    switch (c8461l2.yandex) {
                        case 0:
                            str = "bruhcollective.itaysonlab.libvkx.LIBVKX_SERVICE";
                            break;
                        default:
                            str = "ru.ytkab0bp.vkmusic.BIND_EXTERNAL_SERVICE";
                            break;
                    }
                } else {
                    next = null;
                }
                c8461l = (C8461l) next;
                if (c8461l != null) {
                    c5835l = new C5835l(getApplicationContext());
                    switch (c8461l.yandex) {
                        case 0:
                            return new BinderC16109l(c5835l);
                        default:
                            return new BinderC3896l(c5835l);
                    }
                }
            } while (!AbstractC8576l.yandex(action, str));
            c8461l = (C8461l) next;
            if (c8461l != null) {
                c5835l = new C5835l(getApplicationContext());
                switch (c8461l.yandex) {
                    case 0:
                        return new BinderC16109l(c5835l);
                    default:
                        return new BinderC3896l(c5835l);
                }
            }
        }
        return null;
    }
}
