package org.bouncycastle.jce.provider;

import defpackage.AbstractC8776l;
import defpackage.C12726l;
import defpackage.C12933l;
import defpackage.C14063l;
import defpackage.C2396l;
import defpackage.C3797l;
import defpackage.C8339l;
import j$.util.DesugarCollections;
import java.security.Permission;
import java.security.spec.DSAParameterSpec;
import java.security.spec.ECParameterSpec;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: loaded from: classes3.dex */
class BouncyCastleProviderConfiguration implements ProviderConfiguration {
    private volatile Object dhDefaultParams;
    private volatile C12726l ecImplicitCaParams;
    private static Permission BC_EC_LOCAL_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, ConfigurableProvider.THREAD_LOCAL_EC_IMPLICITLY_CA);
    private static Permission BC_EC_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, ConfigurableProvider.EC_IMPLICITLY_CA);
    private static Permission BC_DH_LOCAL_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, ConfigurableProvider.THREAD_LOCAL_DH_DEFAULT_PARAMS);
    private static Permission BC_DH_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, ConfigurableProvider.DH_DEFAULT_PARAMS);
    private static Permission BC_EC_CURVE_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, ConfigurableProvider.ACCEPTABLE_EC_CURVES);
    private static Permission BC_ADDITIONAL_EC_CURVE_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, ConfigurableProvider.ADDITIONAL_EC_PARAMETERS);
    private ThreadLocal ecThreadSpec = new ThreadLocal();
    private ThreadLocal dhThreadSpec = new ThreadLocal();
    private volatile Set acceptableNamedCurves = new HashSet();
    private volatile Map additionalECParameters = new HashMap();

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public Set getAcceptableNamedCurves() {
        return DesugarCollections.unmodifiableSet(this.acceptableNamedCurves);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public Map getAdditionalECParameters() {
        return DesugarCollections.unmodifiableMap(this.additionalECParameters);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public DHParameterSpec getDHDefaultParameters(int i) {
        Object obj = this.dhThreadSpec.get();
        if (obj == null) {
            obj = this.dhDefaultParams;
        }
        if (obj instanceof DHParameterSpec) {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) obj;
            if (dHParameterSpec.getP().bitLength() == i) {
                return dHParameterSpec;
            }
        } else if (obj instanceof DHParameterSpec[]) {
            DHParameterSpec[] dHParameterSpecArr = (DHParameterSpec[]) obj;
            for (int i2 = 0; i2 != dHParameterSpecArr.length; i2++) {
                if (dHParameterSpecArr[i2].getP().bitLength() == i) {
                    return dHParameterSpecArr[i2];
                }
            }
        }
        C2396l c2396l = (C2396l) AbstractC8776l.crashlytics(C3797l.f7901l, i);
        if (c2396l != null) {
            return new C14063l(c2396l);
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public DSAParameterSpec getDSADefaultParameters(int i) {
        C12933l c12933l = (C12933l) AbstractC8776l.crashlytics(C3797l.f7900l, i);
        if (c12933l != null) {
            return new DSAParameterSpec(c12933l.f25380l, c12933l.f25381l, c12933l.f25382l);
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public C12726l getEcImplicitlyCa() {
        C12726l c12726l = (C12726l) this.ecThreadSpec.get();
        return c12726l != null ? c12726l : this.ecImplicitCaParams;
    }

    public void setParameter(String str, Object obj) {
        SecurityManager securityManager = System.getSecurityManager();
        if (str.equals(ConfigurableProvider.THREAD_LOCAL_EC_IMPLICITLY_CA)) {
            if (securityManager != null) {
                securityManager.checkPermission(BC_EC_LOCAL_PERMISSION);
            }
            C12726l c12726lConvertSpec = ((obj instanceof C12726l) || obj == null) ? (C12726l) obj : EC5Util.convertSpec((ECParameterSpec) obj);
            ThreadLocal threadLocal = this.ecThreadSpec;
            if (c12726lConvertSpec == null) {
                threadLocal.remove();
                return;
            } else {
                threadLocal.set(c12726lConvertSpec);
                return;
            }
        }
        if (str.equals(ConfigurableProvider.EC_IMPLICITLY_CA)) {
            if (securityManager != null) {
                securityManager.checkPermission(BC_EC_PERMISSION);
            }
            if ((obj instanceof C12726l) || obj == null) {
                this.ecImplicitCaParams = (C12726l) obj;
                return;
            } else {
                this.ecImplicitCaParams = EC5Util.convertSpec((ECParameterSpec) obj);
                return;
            }
        }
        if (str.equals(ConfigurableProvider.THREAD_LOCAL_DH_DEFAULT_PARAMS)) {
            if (securityManager != null) {
                securityManager.checkPermission(BC_DH_LOCAL_PERMISSION);
            }
            if (!(obj instanceof DHParameterSpec) && !(obj instanceof DHParameterSpec[]) && obj != null) {
                C8339l.metrica("not a valid DHParameterSpec");
                return;
            }
            ThreadLocal threadLocal2 = this.dhThreadSpec;
            if (obj == null) {
                threadLocal2.remove();
                return;
            } else {
                threadLocal2.set(obj);
                return;
            }
        }
        if (str.equals(ConfigurableProvider.DH_DEFAULT_PARAMS)) {
            if (securityManager != null) {
                securityManager.checkPermission(BC_DH_PERMISSION);
            }
            if ((obj instanceof DHParameterSpec) || (obj instanceof DHParameterSpec[]) || obj == null) {
                this.dhDefaultParams = obj;
                return;
            } else {
                C8339l.metrica("not a valid DHParameterSpec or DHParameterSpec[]");
                return;
            }
        }
        if (str.equals(ConfigurableProvider.ACCEPTABLE_EC_CURVES)) {
            if (securityManager != null) {
                securityManager.checkPermission(BC_EC_CURVE_PERMISSION);
            }
            this.acceptableNamedCurves = (Set) obj;
        } else if (str.equals(ConfigurableProvider.ADDITIONAL_EC_PARAMETERS)) {
            if (securityManager != null) {
                securityManager.checkPermission(BC_ADDITIONAL_EC_CURVE_PERMISSION);
            }
            this.additionalECParameters = (Map) obj;
        }
    }
}
