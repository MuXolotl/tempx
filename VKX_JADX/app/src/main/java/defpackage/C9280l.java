package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lٍؒۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9280l {
    public final C16050l loadAd = new C16050l(4);
    public final AbstractC15781l yandex;

    public C9280l(AbstractC15781l abstractC15781l) {
        this.yandex = abstractC15781l;
    }

    public final C7718l amazon(String str) {
        return (C7718l) AbstractC2021l.purchase(this.yandex, true, false, new C6908l(str, 25));
    }

    public final int billing(EnumC9176l enumC9176l, String str) {
        return ((Number) AbstractC2021l.purchase(this.yandex, false, true, new C15575l(enumC9176l, str, 15))).intValue();
    }

    public final EnumC9176l crashlytics(String str) {
        return (EnumC9176l) AbstractC2021l.purchase(this.yandex, true, false, new C6908l(str, 26));
    }

    public final void loadAd(InterfaceC0684l interfaceC0684l, C11154l c11154l) {
        C5386l c5386l = (C5386l) c11154l.keySet();
        C11154l c11154l2 = c5386l.f11532l;
        if (c11154l2.isEmpty()) {
            return;
        }
        if (c11154l.f11161l > 999) {
            AbstractC16655l.smaato(c11154l, new C2893l(this, interfaceC0684l, 1));
            return;
        }
        StringBuilder sb = new StringBuilder("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int i = c11154l2.f11161l;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        InterfaceC14742l interfaceC14742lMo668l = interfaceC0684l.mo668l(sb.toString());
        Iterator it = c5386l.iterator();
        int i3 = 1;
        while (true) {
            C11786l c11786l = (C11786l) it;
            if (!c11786l.hasNext()) {
                try {
                    break;
                } catch (Throwable th) {
                    interfaceC14742lMo668l.close();
                    throw th;
                }
            }
            interfaceC14742lMo668l.mo824final(i3, (String) c11786l.next());
            i3++;
        }
        int iLoadAd = AbstractC8513l.loadAd(interfaceC14742lMo668l, "work_spec_id");
        if (iLoadAd == -1) {
            interfaceC14742lMo668l.close();
            return;
        }
        while (interfaceC14742lMo668l.mo827l()) {
            List list = (List) c11154l.get(interfaceC14742lMo668l.mo826implements(iLoadAd));
            if (list != null) {
                list.add(interfaceC14742lMo668l.mo826implements(0));
            }
        }
        interfaceC14742lMo668l.close();
    }

    public final void mopub(int i, String str) {
        AbstractC2021l.purchase(this.yandex, false, true, new C5568l(i, str));
    }

    public final int purchase(long j, String str) {
        return ((Number) AbstractC2021l.purchase(this.yandex, false, true, new C16143l(j, str, 0))).intValue();
    }

    public final void yandex(InterfaceC0684l interfaceC0684l, C11154l c11154l) {
        C5386l c5386l = (C5386l) c11154l.keySet();
        C11154l c11154l2 = c5386l.f11532l;
        if (c11154l2.isEmpty()) {
            return;
        }
        if (c11154l.f11161l > 999) {
            AbstractC16655l.smaato(c11154l, new C2893l(this, interfaceC0684l, 0));
            return;
        }
        StringBuilder sb = new StringBuilder("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int i = c11154l2.f11161l;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        InterfaceC14742l interfaceC14742lMo668l = interfaceC0684l.mo668l(sb.toString());
        Iterator it = c5386l.iterator();
        int i3 = 1;
        while (true) {
            C11786l c11786l = (C11786l) it;
            if (!c11786l.hasNext()) {
                try {
                    break;
                } catch (Throwable th) {
                    interfaceC14742lMo668l.close();
                    throw th;
                }
            }
            interfaceC14742lMo668l.mo824final(i3, (String) c11786l.next());
            i3++;
        }
        int iLoadAd = AbstractC8513l.loadAd(interfaceC14742lMo668l, "work_spec_id");
        if (iLoadAd == -1) {
            interfaceC14742lMo668l.close();
            return;
        }
        while (interfaceC14742lMo668l.mo827l()) {
            List list = (List) c11154l.get(interfaceC14742lMo668l.mo826implements(iLoadAd));
            if (list != null) {
                byte[] blob = interfaceC14742lMo668l.getBlob(0);
                C4279l c4279l = C4279l.loadAd;
                list.add(AbstractC7280l.loadAd(blob));
            }
        }
        interfaceC14742lMo668l.close();
    }
}
