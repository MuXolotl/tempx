package defpackage;

import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: renamed from: lٖٖؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16410l extends C16492l {
    public String adcel;
    public String ads;
    public Date metrica;
    public String subscription;
    public EnumC7121l vip;
    public final ArrayList tapsense = new ArrayList();
    public final ArrayList Signature = new ArrayList();
    public final ArrayList license = new ArrayList();
    public EnumC10143l startapp = EnumC10143l.f20652l;

    @Override // defpackage.C16492l
    public final C18449l yandex() {
        C18449l c18449lBilling = AbstractC11999l.billing(this);
        c18449lBilling.Signature(this.vip, "fileType");
        c18449lBilling.Signature(this.metrica, "timestamp");
        c18449lBilling.Signature(this.startapp, "endian");
        c18449lBilling.Signature(null, "audioEncoding");
        c18449lBilling.Signature(this.adcel, "name");
        c18449lBilling.Signature(this.ads, "author");
        c18449lBilling.Signature(this.subscription, "copyright");
        c18449lBilling.Signature(this.tapsense, "applicationIdentifiers");
        c18449lBilling.Signature(this.Signature, "comments");
        c18449lBilling.Signature(this.license, "annotations");
        return c18449lBilling;
    }
}
