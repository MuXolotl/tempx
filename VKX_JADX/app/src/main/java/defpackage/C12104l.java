package defpackage;

import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lِۚۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12104l implements Iterator {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f24061l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f24062l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24063l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ AbstractMap f24064l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Iterator f24065l;

    public /* synthetic */ C12104l(C3052l c3052l) {
        this.f24063l = 2;
        Objects.requireNonNull(c3052l);
        this.f24064l = c3052l;
        this.f24062l = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f24063l;
        AbstractMap abstractMap = this.f24064l;
        switch (i) {
            case 0:
                return this.f24062l + 1 < ((C16515l) abstractMap).f32283l.size() || yandex().hasNext();
            case 1:
                C2902l c2902l = (C2902l) abstractMap;
                if (this.f24062l + 1 >= c2902l.f6308l) {
                    return !c2902l.f6307l.isEmpty() && yandex().hasNext();
                }
                return true;
            case 2:
                C3052l c3052l = (C3052l) abstractMap;
                if (this.f24062l + 1 >= c3052l.f6577l) {
                    return !c3052l.f6576l.isEmpty() && loadAd().hasNext();
                }
                return true;
            default:
                C13639l c13639l = (C13639l) abstractMap;
                if (this.f24062l + 1 >= c13639l.f26665l) {
                    return !c13639l.f26664l.isEmpty() && loadAd().hasNext();
                }
                return true;
        }
    }

    public Iterator loadAd() {
        int i = this.f24063l;
        AbstractMap abstractMap = this.f24064l;
        switch (i) {
            case 2:
                if (this.f24065l == null) {
                    this.f24065l = ((C3052l) abstractMap).f6576l.entrySet().iterator();
                }
                break;
            default:
                if (this.f24065l == null) {
                    this.f24065l = ((C13639l) abstractMap).f26664l.entrySet().iterator();
                }
                break;
        }
        return this.f24065l;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f24063l;
        AbstractMap abstractMap = this.f24064l;
        switch (i) {
            case 0:
                this.f24061l = true;
                int i2 = this.f24062l + 1;
                this.f24062l = i2;
                C16515l c16515l = (C16515l) abstractMap;
                return i2 < c16515l.f32283l.size() ? (Map.Entry) c16515l.f32283l.get(this.f24062l) : (Map.Entry) yandex().next();
            case 1:
                this.f24061l = true;
                int i3 = this.f24062l + 1;
                this.f24062l = i3;
                C2902l c2902l = (C2902l) abstractMap;
                return i3 < c2902l.f6308l ? (C9055l) c2902l.f6309l[i3] : (Map.Entry) yandex().next();
            case 2:
                this.f24061l = true;
                int i4 = this.f24062l + 1;
                this.f24062l = i4;
                C3052l c3052l = (C3052l) abstractMap;
                return i4 < c3052l.f6577l ? (C9504l) c3052l.f6578l[i4] : (Map.Entry) loadAd().next();
            default:
                this.f24061l = true;
                int i5 = this.f24062l + 1;
                this.f24062l = i5;
                C13639l c13639l = (C13639l) abstractMap;
                return i5 < c13639l.f26665l ? (C0900l) c13639l.f26666l[i5] : (Map.Entry) loadAd().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f24063l;
        AbstractMap abstractMap = this.f24064l;
        switch (i) {
            case 0:
                C16515l c16515l = (C16515l) abstractMap;
                if (!this.f24061l) {
                    C8339l.smaato("remove() was called before next()");
                } else {
                    this.f24061l = false;
                    int i2 = C16515l.f32281l;
                    c16515l.loadAd();
                    if (this.f24062l >= c16515l.f32283l.size()) {
                        yandex().remove();
                    } else {
                        int i3 = this.f24062l;
                        this.f24062l = i3 - 1;
                        c16515l.billing(i3);
                    }
                }
                break;
            case 1:
                C2902l c2902l = (C2902l) abstractMap;
                if (!this.f24061l) {
                    C8339l.smaato("remove() was called before next()");
                } else {
                    this.f24061l = false;
                    int i4 = C2902l.f6306l;
                    c2902l.loadAd();
                    int i5 = this.f24062l;
                    if (i5 >= c2902l.f6308l) {
                        yandex().remove();
                    } else {
                        this.f24062l = i5 - 1;
                        c2902l.admob(i5);
                    }
                }
                break;
            case 2:
                if (!this.f24061l) {
                    C8339l.smaato("remove() was called before next()");
                } else {
                    this.f24061l = false;
                    C3052l c3052l = (C3052l) abstractMap;
                    c3052l.billing();
                    int i6 = this.f24062l;
                    if (i6 >= c3052l.f6577l) {
                        loadAd().remove();
                    } else {
                        this.f24062l = i6 - 1;
                        c3052l.amazon(i6);
                    }
                }
                break;
            default:
                C13639l c13639l = (C13639l) abstractMap;
                if (!this.f24061l) {
                    C8339l.smaato("remove() was called before next()");
                } else {
                    this.f24061l = false;
                    int i7 = C13639l.f26663l;
                    c13639l.mopub();
                    int i8 = this.f24062l;
                    if (i8 >= c13639l.f26665l) {
                        loadAd().remove();
                    } else {
                        this.f24062l = i8 - 1;
                        c13639l.purchase(i8);
                    }
                }
                break;
        }
    }

    public Iterator yandex() {
        int i = this.f24063l;
        AbstractMap abstractMap = this.f24064l;
        switch (i) {
            case 0:
                if (this.f24065l == null) {
                    this.f24065l = ((C16515l) abstractMap).f32282l.entrySet().iterator();
                }
                break;
            default:
                if (this.f24065l == null) {
                    this.f24065l = ((C2902l) abstractMap).f6307l.entrySet().iterator();
                }
                break;
        }
        return this.f24065l;
    }

    public /* synthetic */ C12104l(AbstractMap abstractMap, int i) {
        this.f24063l = i;
        this.f24064l = abstractMap;
        this.f24062l = -1;
    }
}
