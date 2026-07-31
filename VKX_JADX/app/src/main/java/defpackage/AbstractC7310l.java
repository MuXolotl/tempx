package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؚ٘ؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7310l {
    public static final C13617l yandex = new C13617l(18);

    public static final C18128l admob(C13146l c13146l, C14965l c14965l) {
        int i = c13146l.f25716l;
        if ((i & 32) == 32) {
            return c13146l.f25728l;
        }
        if ((i & 64) == 64) {
            return c14965l.mopub(c13146l.f25737l);
        }
        return null;
    }

    public static final AbstractC4946l amazon(AbstractC4946l abstractC4946l, InterfaceC16902l interfaceC16902l) {
        if (interfaceC16902l == null || abstractC4946l.yandex() == 1) {
            return abstractC4946l;
        }
        if (interfaceC16902l.mo2182l() == abstractC4946l.yandex()) {
            return abstractC4946l.crashlytics() ? new C10636l(1, new C15013l(C16412l.purchase, new C7646l(5, abstractC4946l))) : new C10636l(abstractC4946l.loadAd());
        }
        C14811l c14811l = new C14811l(abstractC4946l);
        C16017l.f31395l.getClass();
        return new C10636l(1, new C18655l(abstractC4946l, c14811l, false, C16017l.f31394l));
    }

    public static final C18128l billing(C18128l c18128l, C14965l c14965l) {
        int i = c18128l.f35423l;
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            return c18128l.f35422l;
        }
        if ((i & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) == 512) {
            return c14965l.mopub(c18128l.f35439l);
        }
        return null;
    }

    public static final List crashlytics(C13146l c13146l, C14965l c14965l) {
        List arrayList = c13146l.f25734l;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            List list = c13146l.f25715l;
            arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(c14965l.mopub(((Integer) it.next()).intValue()));
            }
        }
        return arrayList;
    }

    public static final List firebase(C6582l c6582l, C14965l c14965l) {
        List arrayList = c6582l.f13777l;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            List list = c6582l.f13794l;
            arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(c14965l.mopub(((Integer) it.next()).intValue()));
            }
        }
        return arrayList;
    }

    public static final C18128l isPro(C13146l c13146l, C14965l c14965l) {
        int i = c13146l.f25716l;
        if ((i & 8) == 8) {
            return c13146l.f25717l;
        }
        if ((i & 16) == 16) {
            return c14965l.mopub(c13146l.f25720l);
        }
        C8339l.smaato("No returnType in ProtoBuf.Property");
        return null;
    }

    public static final List loadAd(C14036l c14036l, C14965l c14965l) {
        List arrayList = c14036l.f27372l;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            List list = c14036l.f27357l;
            arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(c14965l.mopub(((Integer) it.next()).intValue()));
            }
        }
        return arrayList;
    }

    public static final C18128l mopub(C14036l c14036l, C14965l c14965l) {
        int i = c14036l.f27358l;
        if ((i & 32) == 32) {
            return c14036l.f27368l;
        }
        if ((i & 64) == 64) {
            return c14965l.mopub(c14036l.f27375l);
        }
        return null;
    }

    public static final int purchase(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final List remoteconfig(C17586l c17586l, C14965l c14965l) {
        List arrayList = c17586l.f34239l;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            List list = c17586l.f34245l;
            arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(c14965l.mopub(((Integer) it.next()).intValue()));
            }
        }
        return arrayList;
    }

    public static final C18128l smaato(C18426l c18426l, C14965l c14965l) {
        int i = c18426l.f35984l;
        if ((i & 4) == 4) {
            return c18426l.f35993l;
        }
        if ((i & 8) == 8) {
            return c14965l.mopub(c18426l.f35985l);
        }
        C8339l.smaato("No type in ProtoBuf.ValueParameter");
        return null;
    }

    public static final C18128l subs(C14036l c14036l, C14965l c14965l) {
        int i = c14036l.f27358l;
        if ((i & 8) == 8) {
            return c14036l.f27359l;
        }
        if ((i & 16) == 16) {
            return c14965l.mopub(c14036l.f27362l);
        }
        C8339l.smaato("No returnType in ProtoBuf.Function");
        return null;
    }

    public static AbstractC10794l vip(AbstractC10794l abstractC10794l) {
        if (!(abstractC10794l instanceof C0232l)) {
            return new C1522l(abstractC10794l, 0);
        }
        C0232l c0232l = (C0232l) abstractC10794l;
        InterfaceC16902l[] interfaceC16902lArr = c0232l.loadAd;
        ArrayList<C8195l> arrayListM2396abstract = AbstractC8669l.m2396abstract(c0232l.crashlytics, interfaceC16902lArr);
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(arrayListM2396abstract, 10));
        for (C8195l c8195l : arrayListM2396abstract) {
            arrayList.add(amazon((AbstractC4946l) c8195l.f17098l, (InterfaceC16902l) c8195l.f17097l));
        }
        return new C0232l(interfaceC16902lArr, (AbstractC4946l[]) arrayList.toArray(new AbstractC4946l[0]), true);
    }

    public static final List yandex(C6582l c6582l, C14965l c14965l) {
        List arrayList = c6582l.f13772l;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            List list = c6582l.f13797l;
            arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(c14965l.mopub(((Integer) it.next()).intValue()));
            }
        }
        return arrayList;
    }
}
