package org.bouncycastle.jce.provider;

import defpackage.AbstractC0653l;
import defpackage.C10915l;
import defpackage.C12378l;
import defpackage.C12391l;
import defpackage.C16437l;
import defpackage.C5722l;
import defpackage.C7606l;
import defpackage.C8339l;
import defpackage.Cclass;
import defpackage.Cthrow;
import defpackage.applovin;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class PKIXNameConstraintValidator {
    C7606l validator;

    public PKIXNameConstraintValidator() {
        C7606l c7606l = new C7606l();
        c7606l.yandex = new HashSet();
        c7606l.loadAd = new HashSet();
        c7606l.crashlytics = new HashSet();
        c7606l.amazon = new HashSet();
        c7606l.purchase = new HashSet();
        c7606l.billing = new HashSet();
        this.validator = c7606l;
    }

    public void addExcludedSubtree(C5722l c5722l) {
        C7606l c7606l = this.validator;
        c7606l.getClass();
        C12378l c12378l = c5722l.f12104l;
        applovin applovinVar = c12378l.f24470l;
        int i = c12378l.f24469l;
        if (i == 0) {
            HashSet hashSet = c7606l.billing;
            C16437l c16437lVip = C16437l.vip(applovinVar);
            HashSet hashSet2 = hashSet != null ? new HashSet(hashSet) : new HashSet();
            hashSet2.add(c16437lVip);
            c7606l.billing = hashSet2;
            return;
        }
        if (i == 1) {
            Set<String> set = c7606l.crashlytics;
            String strMopub = C7606l.mopub(applovinVar);
            if (set.isEmpty()) {
                set.add(strMopub);
            } else {
                HashSet hashSet3 = new HashSet();
                for (String str : set) {
                    if (str.indexOf(64) != -1) {
                        String strSubstring = str.substring(str.indexOf(64) + 1);
                        if (strMopub.indexOf(64) == -1) {
                            if (!strMopub.startsWith(".") ? !strSubstring.equalsIgnoreCase(strMopub) : !C7606l.adcel(strSubstring, strMopub)) {
                            }
                            hashSet3.add(strMopub);
                        } else if (str.equalsIgnoreCase(strMopub)) {
                            hashSet3.add(str);
                        }
                        hashSet3.add(str);
                        hashSet3.add(strMopub);
                    } else if (str.startsWith(".")) {
                        if (strMopub.indexOf(64) != -1) {
                            if (C7606l.adcel(strMopub.substring(strMopub.indexOf(64) + 1), str)) {
                                hashSet3.add(str);
                            } else {
                                hashSet3.add(str);
                                hashSet3.add(strMopub);
                            }
                        } else if (strMopub.startsWith(".")) {
                            if (!C7606l.isPro(strMopub, str)) {
                                if (C7606l.adcel(strMopub, str)) {
                                    hashSet3.add(str);
                                } else {
                                    hashSet3.add(str);
                                }
                            }
                            hashSet3.add(strMopub);
                        } else if (C7606l.adcel(strMopub, str)) {
                            hashSet3.add(str);
                        } else {
                            hashSet3.add(str);
                            hashSet3.add(strMopub);
                        }
                    } else if (strMopub.indexOf(64) == -1) {
                        if (strMopub.startsWith(".")) {
                            if (!C7606l.adcel(str, strMopub)) {
                            }
                            hashSet3.add(strMopub);
                        } else if (str.equalsIgnoreCase(strMopub)) {
                            hashSet3.add(str);
                        }
                        hashSet3.add(str);
                        hashSet3.add(strMopub);
                    } else if (strMopub.substring(strMopub.indexOf(64) + 1).equalsIgnoreCase(str)) {
                        hashSet3.add(str);
                    } else {
                        hashSet3.add(str);
                        hashSet3.add(strMopub);
                    }
                }
                set = hashSet3;
            }
            c7606l.crashlytics = set;
            return;
        }
        if (i == 2) {
            Set<String> set2 = c7606l.loadAd;
            String strMopub2 = C7606l.mopub(applovinVar);
            if (set2.isEmpty()) {
                set2.add(strMopub2);
            } else {
                HashSet hashSet4 = new HashSet();
                for (String str2 : set2) {
                    if (!C7606l.isPro(strMopub2, str2)) {
                        boolean zAdcel = C7606l.adcel(strMopub2, str2);
                        hashSet4.add(str2);
                        if (zAdcel) {
                        }
                    }
                    hashSet4.add(strMopub2);
                }
                set2 = hashSet4;
            }
            c7606l.loadAd = set2;
            return;
        }
        if (i == 4) {
            Set set3 = c7606l.yandex;
            Cclass cclassInmobi = Cclass.inmobi(applovinVar);
            if (!set3.isEmpty()) {
                HashSet hashSet5 = new HashSet();
                Iterator it = set3.iterator();
                while (it.hasNext()) {
                    Cclass cclassInmobi2 = Cclass.inmobi(it.next());
                    if (C7606l.startapp(cclassInmobi, cclassInmobi2)) {
                        hashSet5.add(cclassInmobi2);
                    } else {
                        if (!C7606l.startapp(cclassInmobi2, cclassInmobi)) {
                            hashSet5.add(cclassInmobi2);
                        }
                        hashSet5.add(cclassInmobi);
                    }
                }
                set3 = hashSet5;
            } else if (cclassInmobi != null) {
                set3.add(cclassInmobi);
            }
            c7606l.yandex = set3;
            return;
        }
        if (i != 6) {
            if (i != 7) {
                C8339l.smaato(AbstractC0653l.vip(i, "Unknown tag encountered: "));
                return;
            }
            Set<byte[]> set4 = c7606l.purchase;
            byte[] bArr = Cthrow.premium(applovinVar).f36593l;
            if (!set4.isEmpty()) {
                HashSet hashSet6 = new HashSet();
                for (byte[] bArr2 : set4) {
                    HashSet hashSet7 = new HashSet();
                    boolean zEquals = Arrays.equals(bArr2, bArr);
                    hashSet7.add(bArr2);
                    if (!zEquals) {
                        hashSet7.add(bArr);
                    }
                    hashSet6.addAll(hashSet7);
                }
                set4 = hashSet6;
            } else if (bArr != null) {
                set4.add(bArr);
            }
            c7606l.purchase = set4;
            return;
        }
        Set<String> set5 = c7606l.amazon;
        String strMopub3 = C7606l.mopub(applovinVar);
        if (set5.isEmpty()) {
            set5.add(strMopub3);
        } else {
            HashSet hashSet8 = new HashSet();
            for (String str3 : set5) {
                if (str3.indexOf(64) != -1) {
                    String strSubstring2 = str3.substring(str3.indexOf(64) + 1);
                    if (strMopub3.indexOf(64) == -1) {
                        if (!strMopub3.startsWith(".") ? !strSubstring2.equalsIgnoreCase(strMopub3) : !C7606l.adcel(strSubstring2, strMopub3)) {
                        }
                        hashSet8.add(strMopub3);
                    } else if (str3.equalsIgnoreCase(strMopub3)) {
                        hashSet8.add(str3);
                    }
                    hashSet8.add(str3);
                    hashSet8.add(strMopub3);
                } else if (str3.startsWith(".")) {
                    if (strMopub3.indexOf(64) != -1) {
                        if (C7606l.adcel(strMopub3.substring(strMopub3.indexOf(64) + 1), str3)) {
                            hashSet8.add(str3);
                        } else {
                            hashSet8.add(str3);
                            hashSet8.add(strMopub3);
                        }
                    } else if (strMopub3.startsWith(".")) {
                        if (!C7606l.isPro(strMopub3, str3)) {
                            if (C7606l.adcel(strMopub3, str3)) {
                                hashSet8.add(str3);
                            } else {
                                hashSet8.add(str3);
                            }
                        }
                        hashSet8.add(strMopub3);
                    } else if (C7606l.adcel(strMopub3, str3)) {
                        hashSet8.add(str3);
                    } else {
                        hashSet8.add(str3);
                        hashSet8.add(strMopub3);
                    }
                } else if (strMopub3.indexOf(64) == -1) {
                    if (strMopub3.startsWith(".")) {
                        if (!C7606l.adcel(str3, strMopub3)) {
                        }
                        hashSet8.add(strMopub3);
                    } else if (str3.equalsIgnoreCase(strMopub3)) {
                        hashSet8.add(str3);
                    }
                    hashSet8.add(str3);
                    hashSet8.add(strMopub3);
                } else if (strMopub3.substring(strMopub3.indexOf(64) + 1).equalsIgnoreCase(str3)) {
                    hashSet8.add(str3);
                } else {
                    hashSet8.add(str3);
                    hashSet8.add(strMopub3);
                }
            }
            set5 = hashSet8;
        }
        c7606l.amazon = set5;
    }

    public void checkExcluded(C12378l c12378l) throws PKIXNameConstraintValidatorException {
        try {
            this.validator.yandex(c12378l);
        } catch (C12391l e) {
            throw new PKIXNameConstraintValidatorException(e.getMessage(), e);
        }
    }

    public void checkExcludedDN(Cclass cclass) throws PKIXNameConstraintValidatorException {
        try {
            C7606l c7606l = this.validator;
            C10915l c10915lMetrica = C10915l.metrica(cclass);
            Set set = c7606l.yandex;
            Cclass cclassInmobi = Cclass.inmobi(c10915lMetrica);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (C7606l.startapp(cclassInmobi, (Cclass) it.next())) {
                    throw new C12391l("Subject distinguished name is from an excluded subtree");
                }
            }
        } catch (C12391l e) {
            throw new PKIXNameConstraintValidatorException(e.getMessage(), e);
        }
    }

    public void checkExcludedEmail(String str) throws PKIXNameConstraintValidatorException {
        try {
            if (C7606l.firebase(this.validator.crashlytics, str)) {
                throw new C12391l("Email address is from an excluded subtree.");
            }
        } catch (C12391l e) {
            throw new PKIXNameConstraintValidatorException(e.getMessage(), e);
        }
    }

    public void checkPermitted(C12378l c12378l) throws PKIXNameConstraintValidatorException {
        try {
            this.validator.loadAd(c12378l);
        } catch (C12391l e) {
            throw new PKIXNameConstraintValidatorException(e.getMessage(), e);
        }
    }

    public void checkPermittedDN(Cclass cclass) throws PKIXNameConstraintValidatorException {
        try {
            this.validator.crashlytics(C10915l.metrica(cclass));
        } catch (C12391l e) {
            throw new PKIXNameConstraintValidatorException(e.getMessage(), e);
        }
    }

    public void checkPermittedEmail(String str) throws PKIXNameConstraintValidatorException {
        try {
            this.validator.amazon(str);
        } catch (C12391l e) {
            throw new PKIXNameConstraintValidatorException(e.getMessage(), e);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof PKIXNameConstraintValidator) {
            return this.validator.equals(((PKIXNameConstraintValidator) obj).validator);
        }
        return false;
    }

    public int hashCode() {
        return this.validator.hashCode();
    }

    public void intersectEmptyPermittedSubtree(int i) {
        C7606l c7606l = this.validator;
        c7606l.getClass();
        if (i == 0) {
            c7606l.smaato = new HashSet();
            return;
        }
        if (i == 1) {
            c7606l.subs = new HashSet();
            return;
        }
        if (i == 2) {
            c7606l.admob = new HashSet();
            return;
        }
        if (i == 4) {
            c7606l.mopub = new HashSet();
            return;
        }
        if (i == 6) {
            c7606l.isPro = new HashSet();
        } else if (i == 7) {
            c7606l.firebase = new HashSet();
        } else {
            C8339l.smaato(AbstractC0653l.vip(i, "Unknown tag encountered: "));
        }
    }

    public void intersectPermittedSubtree(C5722l c5722l) {
        this.validator.subs(new C5722l[]{c5722l});
    }

    public String toString() {
        return this.validator.toString();
    }

    public void intersectPermittedSubtree(C5722l[] c5722lArr) {
        this.validator.subs(c5722lArr);
    }
}
