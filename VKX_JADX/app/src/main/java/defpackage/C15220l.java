package defpackage;

import j$.util.Objects;
import java.util.Map;

/* JADX INFO: renamed from: lٔ۠٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15220l extends AbstractC10199l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f29815l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC10199l f29816l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public AbstractC10199l f29817l;

    public C15220l(C18252l c18252l) {
        super(0);
        C15333l c15333l = c18252l.f35759l;
        AbstractC8481l abstractC8481lCrashlytics = c15333l.f26705l;
        if (abstractC8481lCrashlytics == null) {
            abstractC8481lCrashlytics = c15333l.crashlytics();
            c15333l.f26705l = abstractC8481lCrashlytics;
        }
        this.f29816l = abstractC8481lCrashlytics.iterator();
        this.f29815l = null;
        this.f29817l = C4247l.f8718l;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29817l.hasNext() || this.f29816l.hasNext();
    }

    @Override // defpackage.AbstractC10199l, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!this.f29817l.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f29816l.next();
            this.f29815l = entry.getKey();
            this.f29817l = ((AbstractC5511l) entry.getValue()).iterator();
        }
        Object obj = this.f29815l;
        Objects.requireNonNull(obj);
        return new C11896l(obj, this.f29817l.next());
    }
}
