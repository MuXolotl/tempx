package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: lؘ٘ۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18131l extends AbstractC5921l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C14025l f35441l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ClassLoader f35442l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final AbstractC5921l f35444l = AbstractC5921l.f12465l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C8688l f35443l = new C8688l(new C10740l(26, this));

    static {
        String str = C14025l.f27330l;
        f35441l = C6162l.adcel("/", false);
    }

    public C18131l(ClassLoader classLoader) {
        this.f35442l = classLoader;
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public static String m4496super(C14025l c14025l) {
        C14025l c14025l2 = f35441l;
        c14025l2.getClass();
        return billing.loadAd(c14025l2, c14025l, true).amazon(c14025l2).f27331l.tapsense();
    }

    @Override // defpackage.AbstractC5921l
    public final void adcel(C14025l c14025l, boolean z) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.AbstractC5921l
    public final void billing(C14025l c14025l, C14025l c14025l2) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.AbstractC5921l
    /* JADX INFO: renamed from: continue */
    public final InterfaceC10506l mo691continue(C14025l c14025l, boolean z) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.AbstractC5921l
    /* JADX INFO: renamed from: default */
    public final InterfaceC14991l mo692default(C14025l c14025l) throws IOException {
        if (!C10819l.firebase(c14025l)) {
            C8876l.billing(c14025l, "file not found: ");
            return null;
        }
        C14025l c14025l2 = f35441l;
        c14025l2.getClass();
        URL resource = this.f35442l.getResource(billing.loadAd(c14025l2, c14025l, false).amazon(c14025l2).f27331l.tapsense());
        if (resource == null) {
            C8876l.billing(c14025l, "file not found: ");
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        return AbstractC7709l.purchase(uRLConnectionOpenConnection.getInputStream());
    }

    @Override // defpackage.AbstractC5921l
    public final List inmobi(C14025l c14025l) {
        String strM4496super = m4496super(c14025l);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((List) this.f35443l.getValue()).iterator();
        boolean z = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            C8195l c8195l = (C8195l) it.next();
            AbstractC5921l abstractC5921l = (AbstractC5921l) c8195l.f17098l;
            C14025l c14025l2 = (C14025l) c8195l.f17097l;
            List listInmobi = abstractC5921l.inmobi(c14025l2.purchase(strM4496super));
            if (listInmobi != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listInmobi) {
                    if (C10819l.firebase((C14025l) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(C10819l.metrica((C14025l) it2.next(), c14025l2));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                AbstractC3984l.license(linkedHashSet, arrayList);
                z = true;
            }
        }
        if (z) {
            return AbstractC16901l.m4213const(linkedHashSet);
        }
        return null;
    }

    @Override // defpackage.AbstractC5921l
    /* JADX INFO: renamed from: private */
    public final C18402l mo694private(C14025l c14025l) {
        if (!C10819l.firebase(c14025l)) {
            return null;
        }
        String strM4496super = m4496super(c14025l);
        for (C8195l c8195l : (List) this.f35443l.getValue()) {
            C18402l c18402lMo694private = ((AbstractC5921l) c8195l.f17098l).mo694private(((C14025l) c8195l.f17097l).purchase(strM4496super));
            if (c18402lMo694private != null) {
                return c18402lMo694private;
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC5921l
    public final List signatures(C14025l c14025l) throws FileNotFoundException {
        String strM4496super = m4496super(c14025l);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (C8195l c8195l : (List) this.f35443l.getValue()) {
            AbstractC5921l abstractC5921l = (AbstractC5921l) c8195l.f17098l;
            C14025l c14025l2 = (C14025l) c8195l.f17097l;
            try {
                List listSignatures = abstractC5921l.signatures(c14025l2.purchase(strM4496super));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listSignatures) {
                    if (C10819l.firebase((C14025l) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(C10819l.metrica((C14025l) it.next(), c14025l2));
                }
                AbstractC3984l.license(linkedHashSet, arrayList2);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return AbstractC16901l.m4213const(linkedHashSet);
        }
        C8876l.billing(c14025l, "file not found: ");
        return null;
    }

    @Override // defpackage.AbstractC5921l
    /* JADX INFO: renamed from: switch */
    public final C13007l mo695switch(C14025l c14025l) throws IOException {
        throw new IOException("resources are not writable");
    }

    @Override // defpackage.AbstractC5921l
    /* JADX INFO: renamed from: throw */
    public final C13007l mo696throw(C14025l c14025l) throws FileNotFoundException {
        if (!C10819l.firebase(c14025l)) {
            C8876l.billing(c14025l, "file not found: ");
            return null;
        }
        String strM4496super = m4496super(c14025l);
        Iterator it = ((List) this.f35443l.getValue()).iterator();
        while (it.hasNext()) {
            C8195l c8195l = (C8195l) it.next();
            try {
                return ((AbstractC5921l) c8195l.f17098l).mo696throw(((C14025l) c8195l.f17097l).purchase(strM4496super));
            } catch (FileNotFoundException unused) {
            }
        }
        C8876l.billing(c14025l, "file not found: ");
        return null;
    }

    @Override // defpackage.AbstractC5921l
    public final void vip(C14025l c14025l) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.AbstractC5921l
    public final InterfaceC10506l yandex(C14025l c14025l) throws IOException {
        throw new IOException(this + " is read-only");
    }
}
