package defpackage;

/* JADX INFO: renamed from: lَۡۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10636l extends AbstractC4946l {
    public final AbstractC18041l loadAd;
    public final int yandex;

    public C10636l(int i, AbstractC18041l abstractC18041l) {
        if (i == 0) {
            purchase(0);
            throw null;
        }
        if (abstractC18041l == null) {
            purchase(1);
            throw null;
        }
        this.yandex = i;
        this.loadAd = abstractC18041l;
    }

    public static /* synthetic */ void purchase(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (i != 4 && i != 5) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // defpackage.AbstractC4946l
    public final AbstractC4946l amazon(C14945l c14945l) {
        if (c14945l != null) {
            return new C10636l(this.yandex, this.loadAd);
        }
        purchase(6);
        throw null;
    }

    @Override // defpackage.AbstractC4946l
    public final boolean crashlytics() {
        return false;
    }

    @Override // defpackage.AbstractC4946l
    public final AbstractC18041l loadAd() {
        AbstractC18041l abstractC18041l = this.loadAd;
        if (abstractC18041l != null) {
            return abstractC18041l;
        }
        purchase(5);
        throw null;
    }

    @Override // defpackage.AbstractC4946l
    public final int yandex() {
        int i = this.yandex;
        if (i != 0) {
            return i;
        }
        purchase(4);
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10636l(AbstractC18041l abstractC18041l) {
        this(1, abstractC18041l);
        if (abstractC18041l != null) {
        } else {
            purchase(2);
            throw null;
        }
    }
}
