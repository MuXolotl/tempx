package org.bouncycastle.jcajce.provider.asymmetric.util;

import defpackage.C11172l;
import defpackage.C18262l;
import defpackage.C7972l;
import defpackage.Cfor;
import defpackage.Csynchronized;
import defpackage.InterfaceC0543l;
import defpackage.InterfaceC12233l;
import defpackage.applovin;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* JADX INFO: loaded from: classes3.dex */
public class PKCS12BagAttributeCarrierImpl implements InterfaceC12233l {
    private Hashtable pkcs12Attributes;
    private Vector pkcs12Ordering;

    public PKCS12BagAttributeCarrierImpl() {
        this(new Hashtable(), new Vector());
    }

    public Hashtable getAttributes() {
        return this.pkcs12Attributes;
    }

    @Override // defpackage.InterfaceC12233l
    public applovin getBagAttribute(Cfor cfor) {
        return (applovin) this.pkcs12Attributes.get(cfor);
    }

    @Override // defpackage.InterfaceC12233l
    public Enumeration getBagAttributeKeys() {
        return this.pkcs12Ordering.elements();
    }

    public Vector getOrdering() {
        return this.pkcs12Ordering;
    }

    @Override // defpackage.InterfaceC12233l
    public boolean hasFriendlyName() {
        return getBagAttribute(InterfaceC0543l.f1888l) != null;
    }

    public void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        Object object = objectInputStream.readObject();
        if (object instanceof Hashtable) {
            this.pkcs12Attributes = (Hashtable) object;
            this.pkcs12Ordering = (Vector) objectInputStream.readObject();
        } else {
            Csynchronized csynchronized = new Csynchronized((byte[]) object);
            while (true) {
                Cfor cfor = (Cfor) csynchronized.ads();
                if (cfor == null) {
                    return;
                } else {
                    setBagAttribute(cfor, csynchronized.ads());
                }
            }
        }
    }

    @Override // defpackage.InterfaceC12233l
    public void setBagAttribute(Cfor cfor, applovin applovinVar) {
        boolean zContainsKey = this.pkcs12Attributes.containsKey(cfor);
        this.pkcs12Attributes.put(cfor, applovinVar);
        if (zContainsKey) {
            return;
        }
        this.pkcs12Ordering.addElement(cfor);
    }

    @Override // defpackage.InterfaceC12233l
    public void setFriendlyName(String str) {
        setBagAttribute(InterfaceC0543l.f1888l, new C11172l(str));
    }

    public int size() {
        return this.pkcs12Ordering.size();
    }

    public void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        if (this.pkcs12Ordering.size() == 0) {
            objectOutputStream.writeObject(new Hashtable());
            objectOutputStream.writeObject(new Vector());
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C7972l c7972l = new C7972l(2, byteArrayOutputStream);
        Enumeration bagAttributeKeys = getBagAttributeKeys();
        while (bagAttributeKeys.hasMoreElements()) {
            Cfor cforM192throws = Cfor.m192throws(bagAttributeKeys.nextElement());
            if (cforM192throws == null) {
                C18262l.metrica("null object detected");
                return;
            }
            cforM192throws.metrica(c7972l, true);
            applovin applovinVar = (applovin) this.pkcs12Attributes.get(cforM192throws);
            if (applovinVar == null) {
                C18262l.metrica("null object detected");
                return;
            }
            applovinVar.billing().metrica(c7972l, true);
        }
        objectOutputStream.writeObject(byteArrayOutputStream.toByteArray());
    }

    public PKCS12BagAttributeCarrierImpl(Hashtable hashtable, Vector vector) {
        this.pkcs12Attributes = hashtable;
        this.pkcs12Ordering = vector;
    }
}
