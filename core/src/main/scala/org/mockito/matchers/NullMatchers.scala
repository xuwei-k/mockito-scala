/*
 * Copyright © 2017 Morgan Stanley.  All rights reserved.
 *
 * THIS SOFTWARE IS SUBJECT TO THE TERMS OF THE MIT LICENSE.
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * IN ADDITION, THE FOLLOWING DISCLAIMER APPLIES IN CONNECTION WITH THIS SOFTWARE:
 * THIS SOFTWARE IS LICENSED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE AND ANY WARRANTY OF NON-INFRINGEMENT, ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. THIS SOFTWARE MAY BE REDISTRIBUTED TO OTHERS ONLY BY EFFECTIVELY USING THIS OR ANOTHER EQUIVALENT DISCLAIMER IN ADDITION TO ANY OTHER REQUIRED LICENSE TERMS.
 */

package org.mockito.matchers

import org.mockito.{ ArgumentMatchers => JavaMatchers }

private[mockito] trait NullMatchers {

  /**
   * Delegates to <code>ArgumentMatchers.isNull()</code>, it's only here so we expose all the `ArgumentMatchers`
   * on a single place, but marked as @deprecated as you shouldn't be testing for nulls
   * on Scala
   *
   */
  @deprecated
  def isNull[T]: T = JavaMatchers.isNull[T]

  /**
   * Delegates to <code>ArgumentMatchers.isNotNull()</code>, it's only here so we expose all the `ArgumentMatchers`
   * on a single place, but marked as @deprecated as you shouldn't be testing for nulls
   * on Scala
   *
   */
  @deprecated
  def isNotNull[T]: T = JavaMatchers.isNotNull[T]
}
